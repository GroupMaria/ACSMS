/**
 * 
 */
package com.acsms.org.dao;

import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.QuotationVO;

/**
 * @author Hp
 *
 */
public class QuotationDao {
	
	private QuotationVO quotation;
	private ConnectionPool connection;
	private Statement statement;
	
	public QuotationDao(QuotationVO quotation) {
		this.quotation=quotation;
	}
	
	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * @param statement the statement to set
	 * @throws Exception 
	 */
	public void setStatement(Statement statement) throws Exception {
		connection=new ConnectionPool();
		this.statement = connection.getStatement();
	}

	private	String generateReferenceNo(){	
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(10000);
		 String refNumber="QTN"+String.valueOf(randomInt);
		return null;
		
	}
	

	public void createNewQuote() {
		// Database Code
		quotation.getCustomer();
		try {
			System.out.println(quotation.getCustomer()+quotation.getProduct()+quotation.getDatePrepared());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}


	
	
}
