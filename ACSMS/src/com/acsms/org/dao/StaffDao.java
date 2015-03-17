package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.StaffVO;

public class StaffDao {

	private StaffVO objStaff;
	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	ConnectionPool staffPool = new ConnectionPool();
	
	public StaffDao() throws Exception {
		staffPool.setConnect(connect);
		staffPool.setStatement(statement);
		statement = staffPool.getStatement();
	}
	
	public StaffDao(StaffVO objStaff)  throws Exception {
		super();
		this.objStaff = objStaff;
		staffPool.setConnect(connect);
		staffPool.setStatement(statement);
		statement = staffPool.getStatement();
	}

	private	String generateStaffNo(){	
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(10000);
		 String custNumber="STAFF"+String.valueOf(randomInt);
		return custNumber;
	}
	
	public StaffVO getStaffByID(String Id) {
		
		objStaff=new StaffVO(); 
		
		try {
			
					
	        String selectDataSQL = "SELECT * FROM staff WHERE staff_id='"+Id+ "'";

     	    ResultSet rs = statement.executeQuery(selectDataSQL);
			
     		while (rs.next()) {
     			objStaff.setStaffid(Id);
     			objStaff.setstaffTitle("Mr");
     			objStaff.setstaffFName(rs.getString("staff_name")); 
     			objStaff.setstaffLName(rs.getString("staff_name"));  
     			objStaff.setstaffPhone(rs.getString("staff_phone"));  
     			objStaff.setstaffEmail(rs.getString("staff_email"));  
     			objStaff.setAdmin(Boolean.parseBoolean(rs.getString("staff_isAdmin")));  	     
  			}
     	    
	  
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(objStaff.getstaffTitle() == null || objStaff.getstaffTitle().equals(""))
		{
			objStaff.setStaffid(Id);
 			objStaff.setstaffTitle("Mr");
 			objStaff.setstaffFName("fn"); 
 			objStaff.setstaffLName("ln");  
 			objStaff.setstaffPhone("staff_phone");  
 			objStaff.setstaffEmail("staff_email");  
 			objStaff.setAdmin(true);  	
		}
		return objStaff;
}
	
	public void addStaff() {
	
				ConnectionPool DB=new ConnectionPool();
				try {
					
					Statement stmt = DB.getStatement();			
			        String insertStaffDataSQL = "INSERT INTO staff VALUES ("
			        		+"'" + generateStaffNo()+"'"				
			        		+"'" + objStaff.getstaffTitle()+"',"		
			        		+"'" + objStaff.getstaffFName() +" "+ objStaff.getstaffLName() +"',"		
			        		+"'" + objStaff.getstaffPhone()+"',"		
			        		+"'" + objStaff.getstaffEmail()+"',"	
			        		+"'" + objStaff.isAdmin()+"'"
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
	        String StaffDataSQL = "UPDATE staff VALUES ("       				
	        		+"staff_id='" + objStaff.getstaffTitle()+"',"		
	        		+"staff_name='" + objStaff.getstaffFName() +" "+ objStaff.getstaffLName() +"',"		
	        		+"staff_email='" + objStaff.getstaffPhone()+"',"		
	        		+"staff_phone='" + objStaff.getstaffEmail()+"',"	
	        		+"staff_isAdmin='" + objStaff.isAdmin()+"\' WHERE staff_id='"+ objStaff.getStaffid() +"'"
	        		+ ")";			  
	        stmt.executeUpdate(StaffDataSQL);		
	        DB.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteStaff() {
	
		ConnectionPool DB=new ConnectionPool();
		try {
			
			Statement stmt = DB.getStatement();			
	        String insertStaffDataSQL = "DELETE FROM staff " +
	        		 "WHERE staff_id='"+ objStaff.getStaffid() +"'";	  
	        stmt.executeUpdate(insertStaffDataSQL);		
	        DB.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
