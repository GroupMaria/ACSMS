package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.acsms.org.vo.StaffVO;

public class ApplicationUserDAO {
	private StaffVO objStaff;
	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	ConnectionPool staffPool = new ConnectionPool();
	
	public ApplicationUserDAO() throws Exception {
		staffPool.setConnect(connect);
		staffPool.setStatement(statement);
		statement = staffPool.getStatement();
	}
	
	public ApplicationUserDAO(StaffVO objStaffVo) {
		try {
				staffPool.setConnect(connect);
				staffPool.setStatement(statement);
				statement = staffPool.getStatement();
				this.objStaff =objStaffVo;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int updatePassword() throws SQLException{
		
			String StaffDataSQL = "UPDATE user SET password='" + objStaff.getNpassword()+"' WHERE userid='"+ objStaff.getStaffid() +"' AND password='"+ objStaff.getCpassword() +"'";			  
	        return statement.executeUpdate(StaffDataSQL);	   		
		
}

}
