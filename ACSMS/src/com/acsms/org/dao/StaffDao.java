package com.acsms.org.dao;

import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.StaffVO;

public class StaffDao {

	private StaffVO objStaff;

	public StaffDao() {
		super();
	}

	public StaffDao(StaffVO objStaff) {
		super();
		this.objStaff = objStaff;
	}

	private	String generateStaffNo(){	
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(10000);
		 String custNumber="STAFF"+String.valueOf(randomInt);
		return custNumber;
	}
	
	public void addStaff() {
	
				ConnectionPool DB=new ConnectionPool();
				try {
					
					Statement stmt = DB.getStatement();			
			        String insertStaffDataSQL = "INSERT INTO STAFF VALUES ("
			        		+"\'" + generateStaffNo()+"\'"				
			        		+"\'" + objStaff.getstaffTitle()+"\',"		
			        		+"\'" + objStaff.getstaffFName() +" "+ objStaff.getstaffLName() +"\',"		
			        		+"\'" + objStaff.getstaffPhone()+"\',"		
			        		+"\'" + objStaff.getstaffEmail()+"\',"	
			        		+"\'" + objStaff.isAdmin()+"\'"
			        		+ ")";			  
			        stmt.executeUpdate(insertStaffDataSQL);		
			        DB.close();
			        
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	public void updateStaff() {
		
		ConnectionPool DB=new ConnectionPool();
		try {
			
			Statement stmt = DB.getStatement();			
	        String insertStaffDataSQL = "INSERT INTO STAFF VALUES ("
	        		+"\'" + generateStaffNo()+"\'"				
	        		+"\'" + objStaff.getstaffTitle()+"\',"		
	        		+"\'" + objStaff.getstaffFName() +" "+ objStaff.getstaffLName() +"\',"		
	        		+"\'" + objStaff.getstaffPhone()+"\',"		
	        		+"\'" + objStaff.getstaffEmail()+"\',"	
	        		+"\'" + objStaff.isAdmin()+"\'"
	        		+ ")";			  
	        stmt.executeUpdate(insertStaffDataSQL);		
	        DB.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteStaff() {
	
		ConnectionPool DB=new ConnectionPool();
		try {
			
			Statement stmt = DB.getStatement();			
	        String insertStaffDataSQL = "INSERT INTO STAFF VALUES ("
	        		+"\'" + generateStaffNo()+"\'"				
	        		+"\'" + objStaff.getstaffTitle()+"\',"		
	        		+"\'" + objStaff.getstaffFName() +" "+ objStaff.getstaffLName() +"\',"		
	        		+"\'" + objStaff.getstaffPhone()+"\',"		
	        		+"\'" + objStaff.getstaffEmail()+"\',"	
	        		+"\'" + objStaff.isAdmin()+"\'"
	        		+ ")";			  
	        stmt.executeUpdate(insertStaffDataSQL);		
	        DB.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
