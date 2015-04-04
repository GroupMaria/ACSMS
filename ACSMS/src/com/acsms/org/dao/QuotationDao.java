package com.acsms.org.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.Statement;
import java.util.Random;

import com.acsms.org.vo.QuotationVO;



/**
 * @author Hp
 *
 */
public class QuotationDao {
	
	private QuotationVO quotation;
	private ConnectionPool connection;
	private Statement statement;
	private Connection connect;
	
	public QuotationDao(QuotationVO quotation) {
		this.quotation=quotation;
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
		this.connect=connection.getConnect();
	}

	/**
	 * @return The Generated Reference Number
	 */
	private	String generateReferenceNo(){	
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(10000);
		 String refNumber="QTN"+String.valueOf(randomInt);
		return refNumber;
		
	}
	
	private double generateTotalExportQuotation(){
		
		//quotation.get
		return 0;
	}
	

	public void createNewQuote() {
		
		quotation.setRefNumber(generateReferenceNo());
		
		// Database Code
		

		quotation.getCustomer();
		
		try {
			CallableStatement cs = null;
			String inserQuotation = "{CALL acsms.insert_quotation("+quotation.getRefNumber()+
					","+ quotation.getDatePrepared()+","+quotation.getCustomer()+","+
					quotation.getProduct()+","+ quotation.getPackedDimensions()+","+ 
					quotation.getPackedWeight()+","+ quotation.getPackedCube()+","+ 
					quotation.getEstimatedShipDate()+","+ quotation.getShippingFrom()+","+ 
					quotation.getShippingTo()+","+ quotation.getDestinationCountry()+","+ 
					quotation.getTermsOfPayment()+","+ quotation.getModeofTransport()+","+ 
					quotation.getProductSellingPrice()+","+ quotation.getProductSellingPriceQuote()+","+ 
					quotation.getSellingPriceQuotedBy()+","+  quotation.getInlandFreightQuote()+","+ 
					quotation.getInlandFreightQuotedBy()+","+  quotation.getInlandUnloading()+","+ 
					quotation.getInland_Pier_deliver()+","+quotation.getInland_terminal_handle()+","+ 
					quotation.getInland_other()+","+  quotation.getInlandFreight()+","+ 
					quotation.getInternationalFreightQuote1()+","+ quotation.getInternationalFreightQuotedBy()+","+ 
					quotation.getFuelAdjustments()+","+  quotation.getContainerStuffing()+","+ 
					quotation.getOthersAirFreight()+","+  quotation.getInlandFreight()+","+ 
					quotation.getInsurance_all_risk()+","+ quotation.getInsurance_srcc()+","+ 
					quotation.getInsurance_warrisk()+","+  quotation.getForwardingFees()+","+ 
					quotation.getConsularPrice()+","+ quotation.getBankingCharges()+","+ 
					quotation.getOtherCharge1Name()+","+  quotation.getOtherCharge1()+","+ 
					quotation.getOtherCharge2Name()+","+ quotation.getOtherCharge2()+")}";
			cs=connect.prepareCall(inserQuotation);
			 // Step-4: register output parameters ...
		    cs.registerOutParameter(1, java.sql.Types.INTEGER);
		    // Step-5: execute the stored procedures: proc3
		    cs.execute();
		    // Step-6: extract the output parameters
		    int param1 = cs.getInt(1);
		    System.out.println("param1=" + param1);
		    // Step-7: get ParameterMetaData
		    ParameterMetaData pmeta = cs.getParameterMetaData();
		    if (pmeta == null) {
		      System.out.println("Vendor does not support ParameterMetaData");
		    } else {
		      System.out.println(pmeta.getParameterType(1));
		    }
			
			
		System.out.println(quotation.getCustomer()+quotation.getProduct()+quotation.getDatePrepared());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}


	
	
}
