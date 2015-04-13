package com.acsms.org.dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.acsms.org.vo.OrderStatusVO;

public class ShipmentStatusDAO {

	private Connection connect;
	ConnectionPool statusPool = new ConnectionPool();
	private OrderStatusVO statusVO;

	
	public ShipmentStatusDAO(OrderStatusVO statusVO) throws Exception {
		// Initialize the status details
		statusPool.setConnect(connect);
		connect=statusPool.getConnect();
		this.statusVO = statusVO;
		
	}

	public void updateStatus() throws SQLException {
		// update the status when required
		
		String SearchOrderDataSQL = "UPDATE acsms.order SET orderstatus = ? WHERE orderid = ?";
		System.out.println("The OrderId from DAO "+statusVO.getOrderid() );
		System.out.println("The StatusID from DB "+statusVO.getStatus());
		PreparedStatement pstmt = connect.prepareStatement(SearchOrderDataSQL);
		if(Integer.parseInt(statusVO.getStatus())==1){
		pstmt.setString(1, "7");
		pstmt.setString(2, statusVO.getOrderid());
		pstmt.executeUpdate();
		System.out.println("Updated status Successfully !!!");
		}
		pstmt.close();

		
	}

}
