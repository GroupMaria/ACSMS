/**
 * 
 */
package com.acsms.org.dao;

import com.acsms.org.vo.QuotationVO;

/**
 * @author Hp
 *
 */
public class QuotationDao {

	
	
	private QuotationVO quotation;
	private ConnectionPool connection;
	
	public QuotationDao(QuotationVO quotation) {
		this.quotation=quotation;
	}
	public void createNewQuote() {
		// Database Code
		quotation.getCustomer();
		connection=new ConnectionPool();
		
		
		
	}

	
	
}
