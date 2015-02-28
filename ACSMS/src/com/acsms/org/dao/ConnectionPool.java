/**
 * 
 */
package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Philip
 * 
 */
public class ConnectionPool {

	private Connection connect = null;
	private Statement statement = null;

	// TODO: Once the application loads , the connection should be created by default

	public Statement getConnect() throws Exception {
		return getStatement();
	}

	private Statement getStatement() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/acsms?"
							+ "user=root&password=admin");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
		} catch (Exception e) {
			throw e;
		} finally {
			
		}
		return statement;
	}

	// You need to close the connection
	public void close() {
		System.out.println("Connection Closed");
		try {

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}

	}
}