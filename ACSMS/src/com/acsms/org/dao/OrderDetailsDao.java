package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.OrderDetailsVO;

public class OrderDetailsDao {

	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	private OrderDetailsVO OrderDetails;

	ConnectionPool orderPool = new ConnectionPool();

	public OrderDetailsDao() throws Exception {
		orderPool.setConnect(connect);
		orderPool.setStatement(statement);
		statement = orderPool.getStatement();
	}

	public OrderDetailsVO getOrderDetails(String quoteId) throws SQLException {
		String selectDataSQL = "SELECT * FROM acsms.quotation where ref_no='"
				+ quoteId + "'";
		ResultSet resultSet = statement.executeQuery(selectDataSQL);

		// iterate through the java resultset
		while (resultSet.next()) {
			
			OrderDetails = new OrderDetailsVO();
			OrderDetails.setCustomer(resultSet.getString("cust_name"));
			OrderDetails.setDatePrepared(resultSet.getDate("date_prepared").toString());
			OrderDetails.setDestinationCountry(resultSet.getString("cust_name"));
			OrderDetails.setEstimatedShipDate(resultSet.getDate("date_est_ship").toString());
			OrderDetails.setPackedCube(resultSet.getString("pack_cube"));
			OrderDetails.setPackedDimensions(resultSet.getString("pack_dim"));
			OrderDetails.setPackedWeight(resultSet.getString("pack_weight"));
			OrderDetails.setProduct(resultSet.getString("product"));
			OrderDetails.setRefNumber(resultSet.getString("ref_no"));
			OrderDetails.setShippingFrom(resultSet.getString("ship_from"));
			OrderDetails.setModeofTransport(resultSet.getString("mode_of_transport"));
			OrderDetails.setShippingTo(resultSet.getString("ship_to"));

		
		}
		return OrderDetails;
	}

	public void generateOrderDetails(String quotationId) {
		// TODO Generate the Order Id

		System.out.println("Record is inserted into DBUSER table!");

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		String refNumber = "ORD" + String.valueOf(randomInt);

		String insertTableSQL = "INSERT INTO `acsms`.`order`"
				+ "(`transid`,`orderid`,`quotationid`,`invoiceid`,`clearanceid`,`awbid`,`userid`,"
				+ "`lasttransdt`) VALUES (<{orderid: }>,<{quotationid: }>,<{invoiceid: }>,<{clearanceid: }>,<{awbid: }>,"
				+ "<{userid: }>,<{lasttransdt: }>)";

		System.out.println(insertTableSQL);

		// execute insert SQL statement
		try {

			statement.executeUpdate(insertTableSQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean checkQuotationId(String quotationId) throws Exception {

		// TODO Check whether the Quotation Id is there in the order Table
		System.out.println("The Quotation Id " + quotationId);

		String selectDataSQL = "SELECT * FROM acsms.order where quotationid='"
				+ quotationId + "'";
		ResultSet resultSet = statement.executeQuery(selectDataSQL);
		Integer id = null;
		while (resultSet.next()) {
			System.out.println("No data available ");
			id = resultSet.getInt("transid");
			System.out.println("transid" + id);
		}

		if (id.equals(null)) {
			return true;
		} else {
			return false;
		}

	}

}
