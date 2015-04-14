package com.acsms.org.vo;

public class StaffVO {
	
	private String staffid ;
	private String staffTitle ;
	private String staffFName;
	private String staffLName;
	private String staffPhone;
	private String staffEmail;
	private String cpassword;
	private String npassword;
	private boolean isAdmin;
	
	public StaffVO() {
		super();
		
	}

	// Constructor
	public StaffVO(String staffid,String staffTitle, String staffFName, String staffLName,
			       String staffPhone, String staffEmail,boolean isAdmin) {
		super();
		this.staffid = staffid;
		this.staffTitle = staffTitle;
		this.staffFName = staffFName;
		this.staffLName = staffLName;
		this.staffPhone = staffPhone;
		this.staffEmail = staffEmail;
		this.isAdmin = isAdmin;
	}
	
	
	public String getStaffid() {
		return staffid;
	}

	public void setStaffid(String staffid) {
		this.staffid = staffid;
	}
	
	
	public String getstaffTitle() {
		return staffTitle;
	}
	public void setstaffTitle(String staffTitle) {
		this.staffTitle = staffTitle;
	}
	
	
	public String getstaffFName() {
		return staffFName;
	}
	public void setstaffFName(String staffFName) {
		this.staffFName = staffFName;
	}
	
	
	public String getstaffLName() {
		return staffLName;
	}
	public void setstaffLName(String staffLName) {
		this.staffLName = staffLName;
	}
	
	
	public String getstaffPhone() {
		return staffPhone;
	}
	public void setstaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	
	
	public String getstaffEmail() {
		return staffEmail;
	}
	public void setstaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	

	public String getNpassword() {
		return npassword;
	}

	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
	
}

