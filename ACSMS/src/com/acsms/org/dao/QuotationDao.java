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
	public QuotationDao(QuotationVO quotation) {
		this.quotation=quotation;
	}
	public void createNewQuote() {
		// Database Code
		quotation.getCustomer();
		
		
	}

	
	
}
