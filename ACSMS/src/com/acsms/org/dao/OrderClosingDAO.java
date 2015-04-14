package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.acsms.org.vo.OrderClosingVO;

public class OrderClosingDAO {
	
	private Connection connect;
	ConnectionPool orderPool = new ConnectionPool();
	private OrderClosingVO closeOrder;

	
	public OrderClosingDAO(OrderClosingVO closeOrder) throws Exception {
		
		orderPool.setConnect(connect);
		connect=orderPool.getConnect();
		this.closeOrder = closeOrder;
		
	
	}

	public void searchOrder() throws SQLException {

		String SearchOrderDataSQL = "Select * from acsms.order where orderid = ?";
		System.out.println("The OrderId from DAO "+closeOrder.getorderid() );
		PreparedStatement pstmt = connect.prepareStatement(SearchOrderDataSQL);
		pstmt.setString(1, closeOrder.getorderid());
		ResultSet rs=pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
		    for (int i = 1; i <= columnsNumber; i++) {
		        if (i > 1) System.out.print(",  ");
		        String columnValue = rs.getString(i);
		        System.out.print(columnValue + " " + rsmd.getColumnName(i));
		        
		        if(rsmd.getColumnName(i).trim().contains("orderstatus")){
		        	System.out.println("Inside the Close Order Status 1");
		        	int status=Integer.parseInt(rs.getString(i));
		        	if(status==7){
		        		closeOrder.setstatusid(status);
		        		//close order
		        		System.out.println("Inside the Close Order Status 2");
		        		closeOrder();
		        	
		        		
		        	}else
		        	{
		        		//Display the Current Status
		        		closeOrder.setstatusid(status);
		        		displayStatusId();
		        	}
		        }
		    }
		    System.out.println("Search Order Functionality ");
		}
		
		pstmt.close();
	}

	public void displayStatusId() throws SQLException {	
		String displayStatusData = "Select * from acsms.status";
		PreparedStatement pstmt = connect.prepareStatement(displayStatusData);
		ResultSet rs=pstmt.executeQuery();
		String message = "";
		List<String> status=new ArrayList<String>();
		while (rs.next()) {
			   	message+=rs.getString("StatusDesc")+",";
			    status.add(rs.getString("StatusDesc"));
			        if (Integer.parseInt(rs.getString("StatusId")) == closeOrder.getStatusId()){
			        	closeOrder.setMessage(message);
			        	closeOrder.setStatus(status);
			        	System.out.println(message);
			        	break;
			        }
			
		}
		
		
		
		

	}

	public void closeOrder() throws SQLException {
		// TODO Logic to close the order by updating the status
		
		String SearchOrderDataSQL = "UPDATE acsms.order SET orderstatus = ? WHERE orderid = ?";
		System.out.println("The OrderId from DAO "+closeOrder.getorderid() );
		System.out.println("The StatusID from DB "+closeOrder.getStatusId());
		PreparedStatement pstmt = connect.prepareStatement(SearchOrderDataSQL);
		pstmt.setString(1, "8");
		pstmt.setString(2, closeOrder.getorderid());
		pstmt.executeUpdate();
		System.out.println("Updated status Successfully !!!" );
		closeOrder.setstatusid(8);
		pstmt.close();
		displayStatusId();

	}

	public OrderClosingVO getOrderClose() {
		return closeOrder;
		
	}

}
