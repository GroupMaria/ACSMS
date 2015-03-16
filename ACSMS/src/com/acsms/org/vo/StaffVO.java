package com.acsms.org.vo;

public class StaffVO {
	
	private String staffTitle ;
	private String staffFName;
	private String staffLName;
	private String staffPhone;
	private String staffEmail;
	private boolean isAdmin;
	
	public StaffVO() {
		super();
		
	}

	// Constructor
	public StaffVO(String staffTitle, String staffFName, String staffLName,
			       String staffPhone, String staffEmail,boolean isAdmin) {
		super();
		this.staffTitle = staffTitle;
		this.staffFName = staffFName;
		this.staffLName = staffLName;
		this.staffPhone = staffPhone;
		this.staffEmail = staffEmail;
		this.isAdmin = isAdmin;
	}
	
	
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	// Title
	public String getstaffTitle() {
		return staffTitle;
	}
	public void setstaffTitle(String staffTitle) {
		this.staffTitle = staffTitle;
	}
	
	// First name
	public String getstaffFName() {
		return staffFName;
	}
	public void setstaffFName(String staffFName) {
		this.staffFName = staffFName;
	}
	
	// Last name
	public String getstaffLName() {
		return staffLName;
	}
	public void setstaffLName(String staffLName) {
		this.staffLName = staffLName;
	}
	
	
	// Phone
	public String getstaffPhone() {
		return staffPhone;
	}
	public void setstaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	
	// Email
	public String getstaffEmail() {
		return staffEmail;
	}
	public void setstaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	
	
}

