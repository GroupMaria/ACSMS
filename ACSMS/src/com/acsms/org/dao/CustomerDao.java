package com.acsms.org.dao;

import java.sql.PreparedStatement;
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
	        		+"\' ?" +"\',"		// Title
	        		+"\' ?" +" "+ "?\',"		// Name
	        		+"\' ?" + "\',"		// Company
	        		+"\' ?" + "\',"		// Street
	        		+"\' ?" + "\',"			// City
	        		+"\' ?" + "\',"		// Province
	        		+"\' ?" + "\',"		// Postal Code
	        		+"\' ?" + "\',"		// Country
	        		+"\' ?" + "\',"		// Phone
	        		+"\' ?" + "\'"		// Email
	        		+ ");";
	        		
	        PreparedStatement pstmtInsertCust = connect.prepareStatement(insertCustDataSQL);
	        
	        pstmtInsertCust.setString(1, objCustomer.getCustTitle());
	        pstmtInsertCust.setString(2, objCustomer.getCustFName());
	        pstmtInsertCust.setString(3, objCustomer.getCustLName());
	        pstmtInsertCust.setString(4, objCustomer.getCustCompany());
	        pstmtInsertCust.setString(5, objCustomer.getCustStreet());
	        pstmtInsertCust.setString(6, objCustomer.getCustCity());
	        pstmtInsertCust.setString(7, objCustomer.getCustProvince());
	        pstmtInsertCust.setString(8, objCustomer.getCustPosCod());
	        pstmtInsertCust.setString(9, objCustomer.getCustCountry());
	        pstmtInsertCust.setString(10, objCustomer.getCustPhone());
	        pstmtInsertCust.setString(11, objCustomer.getCustEmail());
	        		/*
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
	        		*/
	        statement.executeUpdate(insertCustDataSQL);

		return CustID;
	}

}

