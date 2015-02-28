/**
 * 
 */
package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Philip Modified By Hossain
 * 
 */
public class ConnectionPool {

	private Connection connect;
	private Statement statement;

	// TODO: Once the application loads , the connection should be created by
	// default

	private Connection getConnect() {
		return connect;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) throws SQLException {
		// Statements allow to issue SQL queries to the database
		this.statement = getConnect().createStatement();
	}

	void setConnect(Connection connect) throws Exception {

		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			this.connect = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/acsms?"
							+ "user=root&password=admin");

		} catch (Exception e) {
			throw e;
		} finally {

		}

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