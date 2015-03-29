
package com.acsms.org.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.TransportBookingVO;
import com.mysql.jdbc.Connection;

public class TransportBookingDAO {
	
	private TransportBookingVO objTransportBooking;
	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	ConnectionPool customerPool = new ConnectionPool();
	
	public TransportBookingDAO() throws Exception {
		customerPool.setConnect(connect);
		customerPool.setStatement(statement);
		statement = customerPool.getStatement();
	}
	

	// Constructor with values
	public TransportBookingDAO(TransportBookingVO objCustomer) throws Exception {
		super();
		this.objTransportBooking = objCustomer;
		customerPool.setConnect(connect);
		customerPool.setStatement(statement);
		statement = customerPool.getStatement();
	}
	
	// Constructor with no values
	/*
	public CustomerDao() {
		super();
		
	}
	*/
	
	
	// Insert into Database
	public void addNewTransportBooking() throws SQLException{
	
		//String CustID= generateCustomerNo();
	        String insertCustDataSQL = "INSERT INTO Transport_Booking(carr_booking_id,carr_name,"
	        		+ "transport_booking_id,transport_name,invoice_id) VALUES ("
	        		+"\'" + objTransportBooking.getCrrbookID() +"\',"				// Customer ID
	        		+"\'" + objTransportBooking.getCrrName()+"\',"		// Title
	        		+"\'" + objTransportBooking.getTrnsbookID()+"\',"		// Name
	        		+"\'" + objTransportBooking.getTrnsName()+"\',"		// Company
	        		+"\'" + objTransportBooking.getInvoice_id()+"\'"		// Email
	        		+ ");";
	       
	        statement.executeUpdate(insertCustDataSQL);

		}

}

