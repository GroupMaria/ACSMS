package com.acsms.org.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.CustomerVO;

public class CustomerDao {

	private CustomerVO objCustomer;	
	
	// Constructor with values
	public CustomerDao(CustomerVO objCustomer) {
		super();
		this.objCustomer = objCustomer;
	}
	
	// Constructor with no values
	public CustomerDao() {
		super();
		
	}
	
	private	String generateCustomerNo(){	
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(10000);
		 String custNumber="CUST"+String.valueOf(randomInt);
		return custNumber;
	}
	
	// Insert into Database
	public void addNewCust(){
		
		// Try to connect to database
		ConnectionPool DB=new ConnectionPool();
		try {
			
			// Create a statement
			Statement stmt = DB.getStatement();			
		      
			// Create an SQL insert string
	        String insertCustDataSQL = "INSERT INTO Customer VALUES ("
	        		+"\'" + generateCustomerNo()+"\'"				// Customer ID
	        		+"\'" + objCustomer.getCustTitle()+"\',"		// Title
	        		+"\'" + objCustomer.getCustFName() +" "+ objCustomer.getCustLName()+"\',"		// Name
	        		+"\'" + objCustomer.getCustCompany()+"\',"		// Company
	        		+"\'" + objCustomer.getCustStreet()+"\',"		// Street
	        		+"\'" + objCustomer.getCustCity()+"\',"			// City
	        		+"\'" + objCustomer.getCustProvince()+"\',"		// Province
	        		+"\'" + objCustomer.getCustPosCod()+"\',"		// Postal Code
	        		+"\'" + objCustomer.getCustCountry()+"\',"		// Country
	        		+"\'" + objCustomer.getCustPhone()+"\',"		// Phone
	        		+"\'" + objCustomer.getCustEmail()+"\',"		// Email
	        		+ ")";
	        // Execute the string and pass it into SQL
	        stmt.executeUpdate(insertCustDataSQL);
		    
		    // Close the connection  
	        DB.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

