package com.acsms.org.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.acsms.org.ba.*;



public class ReportingDao {

	public Report getReportData(String refNo) {
		String sql = "SELECT cust_name,product,pack_weight, date_est_ship,ship_from,ship_to,dest_country," +
				"price_total_sale,price_special_packing,price_inland_freight,awbid,clearanceid,quotationid FROM `order`  " +
				"inner join quotation on ref_no= order.quotationid where invoiceid=?";
		Report report = null;
		try {
			PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, refNo);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				report = new Report();
				report.setCustomerName(resultSet.getString(1));
				report.setProductName(resultSet.getString(2));
				report.setPackWeight(resultSet.getString(3));
				report.setDate(resultSet.getString(4));
				report.setShipFrom(resultSet.getString(5));
				report.setShipTo(resultSet.getString(6));
				report.setDestCountry(resultSet.getString(7));
				report.setPrice_total_sale(Double.valueOf(resultSet.getString(8)));
				report.setPrice_special_packing(Double.valueOf(resultSet.getString(9)));
				report.setPrice_inland_freight((Double.valueOf(resultSet.getString(10))));
				report.setAwbNo(resultSet.getString(11));
				report.setClearanceNo(resultSet.getString(12));
				report.setQuotationId(resultSet.getString(13));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error in Database");
		} finally {
			/*try {
			//	DBUtil.getConnection().close();
			} catch (SQLException e) {
				System.out.println("error closing connection to db");
			}*/
		}
		return report;
	}
}
