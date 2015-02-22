package com.acsms.org.vo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class QuotationVO {

	public QuotationVO() {

	}

	String DatePrepared;
	String product;
	String customer;
	DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);

	public Date getDatePrepared() throws ParseException {

		return format.parse(DatePrepared);
	}

	public void setDatePrepared(String datePrepared) {
		DatePrepared = datePrepared;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

}
