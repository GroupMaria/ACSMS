package com.acsms.org.vo;

public class TransportBookingVO {

	// Define the value the same as the CustomerBA
	private String crrName ;
	private String crrbookID;
	private String trnsName ;
	private String trnsbookID ;
	private String invoice_id ;
	private String transID;
	
	public TransportBookingVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTransID() {
		return transID;
	}

	public void setTransID(String transID) {
		this.transID = transID;
	}

	// Constructor
	public TransportBookingVO(String crrName,String crrbookID,String trnsName,String trnsbookID,String invoice_id) {
		super();
		this.crrName=crrName ;
		this.crrbookID=crrbookID;
		this.trnsName=trnsName ;
		this.trnsbookID=trnsbookID ;
		this.invoice_id=invoice_id ;
	}
	
	// Setters and getters for all the variables
	
	
	// Title
	
	public String getCrrName() {
		return crrName;
	}

	public void setCrrName(String crrName) {
		this.crrName = crrName;
	}

	public String getCrrbookID() {
		return crrbookID;
	}

	public void setCrrbookID(String crrbookID) {
		this.crrbookID = crrbookID;
	}

	public String getTrnsName() {
		return trnsName;
	}

	public void setTrnsName(String trnsName) {
		this.trnsName = trnsName;
	}

	public String getTrnsbookID() {
		return trnsbookID;
	}

	public void setTrnsbookID(String trnsbookID) {
		this.trnsbookID = trnsbookID;
	}

	public String getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(String invoice_id) {
		this.invoice_id =invoice_id;
	}
		
}

