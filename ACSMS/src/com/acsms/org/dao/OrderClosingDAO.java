package com.acsms.org.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.CustomerVO;
import com.acsms.org.vo.OrderVO;
import com.mysql.jdbc.Connection;
public class OrderClosingDAO {
	private OrderVO objOrder;
	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	ConnectionPool orderPool = new ConnectionPool();
	
	public OrderClosingDAO() throws Exception {
		orderPool.setConnect(connect);
		orderPool.setStatement(statement);
		statement = orderPool.getStatement();
	}
	public OrderClosingDAO(OrderVO objOrder) throws Exception {
		super();
		this.objOrder = objOrder;
		orderPool.setConnect(connect);
		orderPool.setStatement(statement);
		statement = orderPool.getStatement();
	}
	public String searchOrder() throws SQLException{
		
		
	        String SearchOrderDataSQL = "Select * From `order` where orderid = "
	        		+ "\"" + objOrder.getOrderid() + "\"";
	       
	        statement.executeUpdate(SearchOrderDataSQL);

		return objOrder.getOrderid();
	}


}
