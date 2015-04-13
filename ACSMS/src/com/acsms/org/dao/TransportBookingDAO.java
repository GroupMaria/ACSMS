package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import com.acsms.org.vo.TransportBookingVO;

public class TransportBookingDAO {

	private TransportBookingVO objTransportBooking;
	private Connection connect;
	ConnectionPool customerPool = new ConnectionPool();

	// Constructor with values
	public TransportBookingDAO(TransportBookingVO objCustomer) throws Exception {

		this.objTransportBooking = objCustomer;
		customerPool.setConnect(connect);
		connect = customerPool.getConnect();
	}

	public void generateTransportID() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		String transNumber = "TRA" + String.valueOf(randomInt);
		objTransportBooking.setTransID(transNumber);
	}

	// Insert into Database
	public void addNewTransportBooking() throws SQLException {
		generateTransportID();
		String insertCustDataSQL = "INSERT INTO Transport_Booking"
				+ "(carr_booking_id,carr_name,"
				+ "invoice_id,transport_booking,transport_name,transport_booking_id) VALUES"
				+ "(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connect
				.prepareStatement(insertCustDataSQL);
		preparedStatement.setString(1, objTransportBooking.getCrrbookID());
		preparedStatement.setString(2, objTransportBooking.getCrrName());
		preparedStatement.setString(3, objTransportBooking.getInvoice_id());
		preparedStatement.setString(4, objTransportBooking.getTrnsbookID());
		preparedStatement.setString(5, objTransportBooking.getTrnsName());
		preparedStatement.setString(6, objTransportBooking.getTransID());
		preparedStatement.executeUpdate();

	}

}
