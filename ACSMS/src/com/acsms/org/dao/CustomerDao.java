package com.acsms.org.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.CustomerVO;
import com.mysql.jdbc.Connection;

public class CustomerDao {
	
	private CustomerVO objCustomer;
	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	ConnectionPool customerPool = new ConnectionPool();
	
	public CustomerDao() throws Exception {
		customerPool.setConnect(connect);
		customerPool.setStatement(statement);
		statement = customerPool.getStatement();
	}
	

	// Constructor with values
	public CustomerDao(CustomerVO objCustomer) throws Exception {
		super();
		this.objCustomer = objCustomer;
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
	
	private	String generateCustomerNo(){	
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(10000);
		 String custNumber="CUST"+String.valueOf(randomInt);
		 return custNumber;
	}
	
	// Insert into Database
	public String addNewCust() throws SQLException{
	
		String CustID= generateCustomerNo();
	        String insertCustDataSQL = "INSERT INTO Customer VALUES ("
	        		+"\'" + CustID +"\',"				// Customer ID
	        		+"\'" + objCustomer.getCustTitle()+"\',"		// Title
	        		+"\'" + objCustomer.getCustFName() +" "+ objCustomer.getCustLName()+"\',"		// Name
	        		+"\'" + objCustomer.getCustCompany()+"\',"		// Company
	        		+"\'" + objCustomer.getCustStreet()+"\',"		// Street
	        		+"\'" + objCustomer.getCustCity()+"\',"			// City
	        		+"\'" + objCustomer.getCustProvince()+"\',"		// Province
	        		+"\'" + objCustomer.getCustPosCod()+"\',"		// Postal Code
	        		+"\'" + objCustomer.getCustCountry()+"\',"		// Country
	        		+"\'" + objCustomer.getCustPhone()+"\',"		// Phone
	        		+"\'" + objCustomer.getCustEmail()+"\'"		// Email
	        		+ ");";
	       
	        statement.executeUpdate(insertCustDataSQL);

		return CustID;
	}

}

