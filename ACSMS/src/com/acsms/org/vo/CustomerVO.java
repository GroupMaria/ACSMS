package com.acsms.org.vo;

public class CustomerVO {
	// Define the value the same as the CustomerBA
	private String custTitle ;
	private String custFName;
	private String custLName;
	private String custCompany;	
	private String custStreet;
	private String custCity;
	private String custProvince;
	private String custPosCod;
	private String custCountry;
	private String custPhone;
	private String custEmail;
	
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor
	public CustomerVO(String custTitle, String custFName, String custLName,
			String custCompany, String custStreet, String custCity,
			String custProvince, String custPosCod, String custCountry,
			String custPhone, String custEmail) {
		super();
		this.custTitle = custTitle;
		this.custFName = custFName;
		this.custLName = custLName;
		this.custCompany = custCompany;
		this.custStreet = custStreet;
		this.custCity = custCity;
		this.custProvince = custProvince;
		this.custPosCod = custPosCod;
		this.custCountry = custCountry;
		this.custPhone = custPhone;
		this.custEmail = custEmail;
	}
	
	// Setters and getters for all the variables
	
	// Title
	public String getCustTitle() {
		return custTitle;
	}
	public void setCustTitle(String custTitle) {
		this.custTitle = custTitle;
	}
	
	// First name
	public String getCustFName() {
		return custFName;
	}
	public void setCustFName(String custFName) {
		this.custFName = custFName;
	}
	
	// Last name
	public String getCustLName() {
		return custLName;
	}
	public void setCustLName(String custLName) {
		this.custLName = custLName;
	}
	
	// Company
	public String getCustCompany() {
		return custCompany;
	}
	public void setCustCompany(String custCompany) {
		this.custCompany = custCompany;
	}
	
	// Street
	public String getCustStreet() {
		return custStreet;
	}
	public void setCustStreet(String custStreet) {
		this.custStreet = custStreet;
	}
	
	// City
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	
	// Province
	public String getCustProvince() {
		return custProvince;
	}
	public void setCustProvince(String custProvince) {
		this.custProvince = custProvince;
	}
	
	// Postal Code
	public String getCustPosCod() {
		return custPosCod;
	}
	public void setCustPosCod(String custPosCod) {
		this.custPosCod = custPosCod;
	}
	
	// Country
	public String getCustCountry() {
		return custCountry;
	}
	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}
	
	// Phone
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	
	// Email
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	
}

