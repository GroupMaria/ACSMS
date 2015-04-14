package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
	
	public List<StaffVO> GetallStaffs() throws SQLException {
		
		List<StaffVO> users=new ArrayList<StaffVO>();
		
        String selectDataSQL = "SELECT * FROM user";

 	    ResultSet rs = statement.executeQuery(selectDataSQL);
		
 		while (rs.next()) {
 			objStaff=new StaffVO();
 			objStaff.setStaffid(rs.getString("userid"));
 			objStaff.setstaffTitle("Mr");
 			objStaff.setstaffFName(rs.getString("username").substring(0, rs.getString("username").indexOf(" "))); 
 			objStaff.setstaffLName(rs.getString("username").substring(rs.getString("username").indexOf(" ")+1,rs.getString("username").length()));  
 			objStaff.setstaffPhone(rs.getString("phone"));  
 			objStaff.setstaffEmail(rs.getString("email"));  
 			objStaff.setAdmin(rs.getBoolean("role"));  
 			users.add(objStaff);
			}
 	    
	return users;
}
	
	public StaffVO getStaffByID(String Id) throws SQLException {
			
	        String selectDataSQL = "SELECT * FROM user WHERE userid='"+Id+ "'";

     	    ResultSet rs = statement.executeQuery(selectDataSQL);
			
     		while (rs.next()) {
     			objStaff.setStaffid(Id);
     			objStaff.setstaffTitle("Mr");
     			objStaff.setstaffFName(rs.getString("username").substring(0, rs.getString("username").indexOf(" "))); 
     			objStaff.setstaffLName(rs.getString("username").substring(rs.getString("username").indexOf(" ")+1,rs.getString("username").length()));  
     			objStaff.setstaffPhone(rs.getString("phone"));  
     			objStaff.setstaffEmail(rs.getString("email"));  
     			objStaff.setAdmin(rs.getBoolean("role"));  	     
  			}
     	    
		return objStaff;
}
	
	public void addStaff() throws SQLException {
	
	        String insertStaffDataSQL = "INSERT INTO user VALUES ("
	        		+"'" + generateStaffNo()+"',"				
//	        		+"'" + objStaff.getstaffTitle()+"',"		
	        		+"'" + objStaff.getstaffFName() +" "+ objStaff.getstaffLName() +"',"
	        		+"'" + objStaff.getstaffFName()+"',"
	        		+ objStaff.isAdmin() + ","
	        		+"'" + objStaff.getstaffEmail()+"',"
	        		+"'" + objStaff.getstaffPhone() +"'"
	        		+ ")";			  
	        statement.executeUpdate(insertStaffDataSQL);		

	}

	public void updateStaff() throws SQLException {
	
		
			String StaffDataSQL = "UPDATE user SET "       					
	        		+"username='" + objStaff.getstaffFName() +" "+ objStaff.getstaffLName() +"',"		
	        		+"email='" + objStaff.getstaffEmail()+"',"		
	        		+"phone='" + objStaff.getstaffPhone()+"',"	
	        		+"role=" + objStaff.isAdmin()+" WHERE userid='"+ objStaff.getStaffid() +"'";			  
	        statement.executeUpdate(StaffDataSQL);		
	
	}

	public void deleteStaff() throws SQLException {
	
			
	        String insertStaffDataSQL = "DELETE FROM user " +
	        		 "WHERE userid='"+ objStaff.getStaffid() +"'";	
	        statement.executeUpdate(insertStaffDataSQL);	        
		
	}	
	
}
