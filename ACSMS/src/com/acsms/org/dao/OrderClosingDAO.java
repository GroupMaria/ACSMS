package com.acsms.org.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.CustomerVO;
import com.acsms.org.vo.OrderStatusVO;
import com.acsms.org.vo.OrderVO;
import com.mysql.jdbc.Connection;
public class OrderClosingDAO {
	private OrderStatusVO objOrder;
	//private StatusIdVO objStatus;
	private OrderVO objorderid;
	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	ConnectionPool orderPool = new ConnectionPool();
	
	public OrderClosingDAO() throws Exception {
		orderPool.setConnect(connect);
		orderPool.setStatement(statement);
		statement = orderPool.getStatement();
		
	}
	public OrderClosingDAO(OrderStatusVO objStatusId) throws Exception {
		super();
		this.objOrder = objStatusId;
		//StatusIdPool.setConnect(connect);
		//StatusIdPool.setStatement(statement);
		//statement = StatusIdPool.getStatement();
	}
	public String searchOrder() throws SQLException{
		
		
	        String SearchOrderDataSQL = "Select * From `order` where orderid = "
	        		+ "\"" + objorderid.getOrderid() + "\"";
	       
	        statement.executeUpdate(SearchOrderDataSQL);

		return objOrder.getstatusid();
	}
	public String searchStatusId() throws SQLException {
		Object objStatusId = null;
		String SearchStatusIDDataSQL = "Select * From `Status` where statusid = "
        		+ "\"" +  (((OrderStatusVO) objStatusId).getStatusId()+  "");
       
        statement.executeUpdate(SearchStatusIDDataSQL);
		
		return ((OrderStatusVO) objStatusId).getStatusId();
		
		// TODO Auto-generated method stub
		
	}


}
