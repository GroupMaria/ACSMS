package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import com.acsms.org.vo.CustomerVO;

public class CustomerDao {

	private CustomerVO objCustomer;
	private Connection connect;
	ConnectionPool customerPool = new ConnectionPool();

	public CustomerDao() throws Exception {
		customerPool.setConnect(connect);

	}

	// Constructor with values
	public CustomerDao(CustomerVO objCustomer) throws Exception {
		super();
		this.objCustomer = objCustomer;
		customerPool.setConnect(connect);
		connect = customerPool.getConnect();
	}

	private String generateCustomerNo() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		String custNumber = "CUST" + String.valueOf(randomInt);
		return custNumber;
	}

	// Insert into Database
	public String addNewCust() throws SQLException {

		String CustID = generateCustomerNo();
		String name=objCustomer.getCustFName() +" "+ objCustomer.getCustLName();
		System.out.println("Customer ID : "+CustID);
		String insertCustDataSQL = "INSERT INTO acsms.customer"
				+ "(cust_id,title,Name,company,street,City,"
				+ "province,postalcode,country,phone,email)"
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmtInsertCust = connect
				.prepareStatement(insertCustDataSQL);
		pstmtInsertCust.setString(1, CustID);
		pstmtInsertCust.setString(2, objCustomer.getCustTitle());
		pstmtInsertCust.setString(3,name);
		pstmtInsertCust.setString(4, objCustomer.getCustCompany());
		pstmtInsertCust.setString(5, objCustomer.getCustStreet());
		pstmtInsertCust.setString(6, objCustomer.getCustCity());
		pstmtInsertCust.setString(7, objCustomer.getCustProvince());
		pstmtInsertCust.setString(8, objCustomer.getCustPosCod());
		pstmtInsertCust.setString(9, objCustomer.getCustCountry());
		pstmtInsertCust.setString(10, objCustomer.getCustPhone());
		pstmtInsertCust.setString(11, objCustomer.getCustEmail());
		pstmtInsertCust.executeUpdate();
		pstmtInsertCust.close();

		return CustID;
	}

}
