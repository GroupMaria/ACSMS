package com.acsms.org.dao;

import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionPoolTest {

	public static void main(String[] args) {
		// TODO Change to JUnit
		
		ConnectionPool tset=new ConnectionPool();
		try {
			
			Statement statement = tset.getStatement();
		      // Result set get the result of the SQL query
		      ResultSet resultSet = statement
		          .executeQuery("select * from acsms.quotation");
		      System.out.println(resultSet);
		      tset.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
