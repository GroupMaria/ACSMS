package com.acsms.org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.acsms.org.vo.QuotationVO;

/**
 * @author Hp
 * 
 */
public class QuotationDao {

	private QuotationVO quotation;
	private ConnectionPool connection;
	private Connection connect;

	public QuotationDao(QuotationVO quotation) {
		this.quotation = quotation;
		connection=new ConnectionPool();
		
		try {
			connection.setConnect(connect);
			connect=connection.getConnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	/**
	 * @return The Generated Reference Number
	 */
	private String generateReferenceNo() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		String refNumber = "QTN" + String.valueOf(randomInt);
		return refNumber;

	}

	public void createNewQuote() {

		quotation.setRefNumber(generateReferenceNo());
		
		//Date manipulation
		
		
		
		String inputPattern = "MM/dd/yyyy";

	    String outputPattern = "yyyy-MM-dd";

	    SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
	    SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

	    Date date = null;
	    String str = null;

	    try {
	        date = inputFormat.parse(quotation.getDatePrepared());
	        str = outputFormat.format(date);

	       
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }

		// Database Code

		String Query = "INSERT INTO  acsms . quotation ( ref_no ,date_prepared ,cust_name ,product ,pack_dim ,"
				+ "pack_weight ,pack_cube ,"
				+ "date_est_ship ,ship_from ,ship_to ,dest_country ,term_of_pay ,mode_of_transport ,"
				+ "price_total_sale ,price_special_packing ,"
				+ "special_price_quoted_by ,price_inland_freight ,inland_price_quoted_by ,inland_unloading ,"
				+ "inland_Pier_deliver ,inland_terminal_handle ,inland_other ,price1_int_freight ,"
				+ "price2_int_freight ,int_freight_quoted_by ,Air_fuel_adj ,air_container ,air_other ,"
				+ "price_insurance ,insurance_all_risk ,insurance_srcc ,insurance_warrisk ,fees_fwd ,fees_consular ,"
				+ "fees_bank ,fees_other1_name ,fees_other1 ,fees_other2_name ,fees_other2 )VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement pstmt = connect.prepareStatement(Query);
			pstmt.setString(1, quotation.getRefNumber());
			pstmt.setString(2, str);
			pstmt.setString(3, quotation.getCustomer());
			pstmt.setString(4, quotation.getProduct());
			pstmt.setString(5, quotation.getPackedDimensions());
			pstmt.setString(6, quotation.getPackedWeight());
			pstmt.setString(7, quotation.getPackedCube());
			pstmt.setString(8, quotation.getEstimatedShipDate());
			pstmt.setString(9, quotation.getShippingFrom());
			pstmt.setString(10, quotation.getShippingTo());
			pstmt.setString(11, quotation.getDestinationCountry());
			pstmt.setString(12, quotation.getTermsOfPayment());
			pstmt.setString(13, quotation.getModeofTransport());
			pstmt.setString(14, quotation.getProductSellingPrice());
			pstmt.setString(15, quotation.getProductSellingPriceQuote());
			pstmt.setString(16, quotation.getSellingPriceQuotedBy());
			pstmt.setString(17, quotation.getInlandFreightQuote());
			pstmt.setString(18, quotation.getInlandFreightQuotedBy());
			pstmt.setString(19, quotation.getInlandUnloading());
			pstmt.setString(20, quotation.getInland_Pier_deliver());
			pstmt.setString(21, quotation.getInland_terminal_handle());
			pstmt.setString(22, quotation.getInlandFreightothers1());
			pstmt.setString(23, quotation.getInlandFreightothers2());
			pstmt.setString(24, quotation.getInternationalFreightQuote1());
			pstmt.setString(25, quotation.getInternationalFreightQuotedBy());
			pstmt.setString(26, quotation.getFuelAdjustments());
			pstmt.setString(27, quotation.getContainerStuffing());
			pstmt.setString(28, quotation.getOthersAirFreight());
			pstmt.setString(29, quotation.getInlandFreight());
			pstmt.setString(30, quotation.getInsurance_all_risk());
			pstmt.setString(31, quotation.getInsurance_srcc());
			pstmt.setString(32, quotation.getInsurance_warrisk());
			pstmt.setString(33, quotation.getForwardingFees());
			pstmt.setString(34, quotation.getConsularPrice());
			pstmt.setString(35, quotation.getBankingCharges());
			pstmt.setString(36, quotation.getOtherCharge1Name());
			pstmt.setString(37, quotation.getOtherCharge1());
			pstmt.setString(38, quotation.getOtherCharge2Name());
			pstmt.setString(39, quotation.getOtherCharge2());
			
			pstmt.executeUpdate();

			System.out.println(quotation.getCustomer() + quotation.getProduct()
					+ quotation.getDatePrepared());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
