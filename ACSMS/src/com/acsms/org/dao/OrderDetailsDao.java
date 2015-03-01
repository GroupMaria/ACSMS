package com.acsms.org.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.OrderDetailsVO;

public class OrderDetailsDao {

	private OrderDetailsVO OrderDetails;
	private ConnectionPool connection;
	private Statement statement;
	
	public OrderDetailsDao() {
		
	}
	public OrderDetailsDao(OrderDetailsVO OrderDetails) {
		this.OrderDetails=OrderDetails;
	}
	
	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * @param statement the statement to set
	 * @throws Exception 
	 */
	public void setStatement(Statement statement) throws Exception {
		connection=new ConnectionPool();
		this.statement = connection.getStatement();
	}

	
	
	public OrderDetailsVO getOrderDetails(int quoteId) {

		ResultSet rs=null;
		try {
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return OrderDetails;
	}


}
