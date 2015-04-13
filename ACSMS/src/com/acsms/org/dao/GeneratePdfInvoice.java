package com.acsms.org.dao;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

import com.acsms.org.vo.OrderDetailsVO;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class GeneratePdfInvoice {
	
	private Connection connect;
	ConnectionPool invoicePool = new ConnectionPool();
	private OrderDetailsVO invoiceVO;

	
	public GeneratePdfInvoice(OrderDetailsVO invoiceVO) throws Exception {
		
		invoicePool.setConnect(connect);
		connect=invoicePool.getConnect();		
		this.invoiceVO=invoiceVO;
	}


	public void searchOrder(String orderid) throws SQLException {
		System.out.println("The corresponding Order ID:"+orderid);
		
		String SearchDataSQL = "Select * from acsms.order where orderid = ?";
		PreparedStatement pstmt = connect.prepareStatement(SearchDataSQL);
		pstmt.setString(1, orderid);
		ResultSet rs=pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
		
				 if(rsmd.getColumnName(i).trim().contains("quotationid")){
					 String quoteID=rs.getString(i);
					 System.out.println("The Quotation ID: "+quoteID);
					 searchQuote(quoteID);
				 }
			}
		}
	}

	private void searchQuote(String quotationid) throws SQLException {
		String SearchQuoteDataSQL = "Select * from acsms.quotation where ref_no = ?";
		PreparedStatement pstmtQuote = connect
				.prepareStatement(SearchQuoteDataSQL);
		pstmtQuote.setString(1, quotationid);
		ResultSet rsQuote = pstmtQuote.executeQuery();
		// Move cursor to the first row.
		System.out.println("Moving cursor to the first row...");
		rsQuote.first();
		// Extract data from result set
		System.out.println("Displaying record...");
		// Retrieve by column name
		String refNumber = rsQuote.getString("ref_no");
		invoiceVO.setRefNumber(refNumber);
		String DatePrepared = rsQuote.getString("date_prepared");
		invoiceVO.setDatePrepared(DatePrepared);
		String product = rsQuote.getString("product");
		invoiceVO.setProduct(product);
		String customer = rsQuote.getString("cust_name");
		invoiceVO.setCustomer(customer);
		String shippingFrom = rsQuote.getString("ship_from");
		invoiceVO.setShippingFrom(shippingFrom);
		String destinationCountry = rsQuote.getString("dest_country");
		invoiceVO.setDestinationCountry(destinationCountry);
		String termsOfPayment = rsQuote.getString("term_of_pay");
		invoiceVO.setTermsOfPayment(termsOfPayment);
		String modeofTransport = rsQuote.getString("mode_of_transport");
		invoiceVO.setModeofTransport(modeofTransport);
		String estimatedShipDate = rsQuote.getString("date_est_ship");
		invoiceVO.setEstimatedShipDate(estimatedShipDate);
		String packedDimensions = rsQuote.getString("pack_dim");
		invoiceVO.setPackedDimensions(packedDimensions);
		String ShippingTo = rsQuote.getString("ship_to");
		invoiceVO.setShippingTo(ShippingTo);
		String packedWeight = rsQuote.getString("pack_weight");
		invoiceVO.setPackedWeight(packedWeight);
		String packedCube = rsQuote.getString("pack_cube");
		invoiceVO.setPackedCube(packedCube);
		pstmtQuote.close();
		
		generatePDFINvoice(invoiceVO);
	}


	public void generatePDFINvoice(OrderDetailsVO invoiceVO) {
		// TODO Auto-generated method stub
		Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                new FileOutputStream("D://BillingInvoice.pdf"));

            document.open();
            Font font1 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
            Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
            Paragraph paragraph = new Paragraph();            
            Chunk chunk = new Chunk("Air Cargo Shipping Management System");
            chunk.setFont(font1);
            Chunk chunk7 = new Chunk("           INVOICE");
            chunk7.setFont(font1);
            Chunk chunk1 = new Chunk("\nACSMS");
            Chunk chunk2 = new Chunk("\n941 Progress Avenue");
            Chunk chunk6 = new Chunk("                                                                                                    INVOICE No[100]");
            chunk6.setFont(font2);            
            Chunk chunk3 = new Chunk("\nToronto,ON M1G 3T8");
            Chunk chunk4 = new Chunk("                                                                   DATE: "+ new Date().toString());
            chunk4.setFont(font2);
            Chunk chunk5 = new Chunk("\n");            
            paragraph.add(chunk);
            paragraph.add(chunk7);
            paragraph.add(chunk1);
            paragraph.add(chunk2);
            paragraph.add(chunk6);
            paragraph.add(chunk3);
            paragraph.add(chunk4);
            paragraph.add(chunk5);            
//            paragraph.setSpacingAfter(50);
//            paragraph.setSpacingBefore(50);
            document.add(paragraph);
            document.add(Chunk.NEWLINE);
            Paragraph addressParagraph = new Paragraph();
            Chunk billingAddress = new Chunk(" Billing Address:                                         Delivery Address:");
            billingAddress.setFont(new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD));
            Chunk name = new Chunk("\n  [Name]                                                                  [Name]");
            Chunk company = new Chunk("\n  [Company]                                             	               [Company]");
            Chunk address = new Chunk("\n  [Address]                                                              [Address]");
            Chunk townCountryPcde = new Chunk("\n  [City, Province, Postal Code]                               [City, Province, Postal Code]");
            Chunk phone = new Chunk("\n  [Phone]                                                                 [Phone]");
            addressParagraph.add(billingAddress);
            addressParagraph.add(name);
            addressParagraph.add(company);
            addressParagraph.add(address);
            addressParagraph.add(townCountryPcde);
            addressParagraph.add(phone);
            document.add(addressParagraph);
            document.add(chunk5);
            document.add(Chunk.NEWLINE);
            document.add(new Phrase("Comments or Special Instructions: "));
            document.add(Chunk.NEWLINE);
            PdfPTable table1 = new PdfPTable(5); 

            PdfPCell salesPer = new PdfPCell(new Paragraph("SALESPERSON"));            
            PdfPCell orderNo = new PdfPCell(new Paragraph("ORDER NUMBER"));
            PdfPCell sentDt = new PdfPCell(new Paragraph("SENT DATE"));
            PdfPCell sentVia = new PdfPCell(new Paragraph("SENT VIA"));
            PdfPCell qNo = new PdfPCell(new Paragraph("QUOATION NUMBER"));
            
            table1.addCell(salesPer);
            table1.addCell(orderNo);
            table1.addCell(sentDt);
            table1.addCell(sentVia);
            table1.addCell(qNo);
            PdfPCell salesPerVal = new PdfPCell(new Paragraph(" "));
            salesPerVal.setFixedHeight(40.0f);
            table1.addCell(salesPerVal);
            table1.addCell(" ");
            table1.addCell(" ");
            table1.addCell(" ");
            table1.addCell(" ");
            
            table1.setWidthPercentage(100);
                        
            document.add(table1);
            document.add(Chunk.NEWLINE);
            
            PdfPTable table2 = new PdfPTable(4); 
            
            PdfPCell tableName = new PdfPCell (new Paragraph ("Baking Details"));            
            tableName.setColspan (4);
            tableName.setHorizontalAlignment (Element.ALIGN_CENTER);
            PdfPCell qty = new PdfPCell(new Paragraph("QUANTITY"));
            PdfPCell des = new PdfPCell(new Paragraph("DESCRIPTION"));
            PdfPCell up = new PdfPCell(new Paragraph("UNIT PRICE"));            
            PdfPCell amt = new PdfPCell(new Paragraph("AMOUNT"));
            table2.addCell(tableName);
            table2.addCell(qty);
            table2.addCell(des); 
            table2.addCell(up);                     
            //table2.addCell(bankName); 
            //table2.addCell(brCode);
            //table2.addCell(brAddr);
            table2.addCell(amt);   
            
            PdfPCell qty1 = new PdfPCell(new Paragraph("Test "));
            PdfPCell des1 = new PdfPCell(new Paragraph("Test "));
            PdfPCell up1 = new PdfPCell(new Paragraph(" Test"));
            //PdfPCell bankName1 = new PdfPCell(new Paragraph(" "));
            //PdfPCell brCode1 = new PdfPCell(new Paragraph(" "));
            //PdfPCell brAddr1 = new PdfPCell(new Paragraph(" "));
            PdfPCell amt1 = new PdfPCell(new Paragraph("Test "));
            
            PdfPCell qty2 = new PdfPCell(new Paragraph("Test "));
            qty2.setBorder(Rectangle.NO_BORDER);
            PdfPCell des2 = new PdfPCell(new Paragraph(" Test"));
            PdfPCell up2 = new PdfPCell(new Paragraph("Test "));
            //PdfPCell bankName2 = new PdfPCell(new Paragraph(" "));
            //PdfPCell brCode2 = new PdfPCell(new Paragraph(" "));
            //PdfPCell brAddr2 = new PdfPCell(new Paragraph(" "));
            PdfPCell amt2 = new PdfPCell(new Paragraph(" "));
            
            PdfPTable nestedTable = new PdfPTable(1);
            
            PdfPCell subTot = new PdfPCell(new Paragraph("SUB TOTAL"));
            subTot.setBorder(Rectangle.NO_BORDER); 
            subTot.setHorizontalAlignment(Element.ALIGN_RIGHT);
            subTot.setRightIndent(-31.0f);
            PdfPCell salesTax = new PdfPCell(new Paragraph("SALES TAX"));
            salesTax.setBorder(Rectangle.NO_BORDER); 
            salesTax.setHorizontalAlignment(Element.ALIGN_RIGHT);
            salesTax.setRightIndent(-31.0f);
            PdfPCell pap = new PdfPCell(new Paragraph("P&P"));
            pap.setBorder(Rectangle.NO_BORDER); 
            pap.setHorizontalAlignment(Element.ALIGN_RIGHT);
            pap.setRightIndent(-31.0f);
            Paragraph totDuePara = new Paragraph();            
            Chunk totDuechunk = new Chunk("TOTAL DUE");
            totDuechunk.setFont(font2);
            totDuePara.add(totDuechunk);
            PdfPCell totDue = new PdfPCell(totDuePara);
            totDue.setBorder(Rectangle.NO_BORDER); 
            totDue.setHorizontalAlignment(Element.ALIGN_RIGHT);
            totDue.setRightIndent(-31.0f);
            nestedTable.addCell(subTot);                      
            nestedTable.addCell(salesTax);
            nestedTable.addCell(pap);
            nestedTable.addCell(totDue);           

            qty2.addElement(nestedTable);
            
            qty1.setFixedHeight(110.0f);
            qty2.setColspan(3);
            table2.addCell(qty1);
            table2.addCell(des1); 
            table2.addCell(up1);
            //table2.addCell(bankName1);
            //table2.addCell(brCode1); 
            //table2.addCell(brAddr1);
            table2.addCell(amt1);            
            
            table2.addCell(qty2);
            table2.addCell(des2); 
            table2.addCell(up2);
            //table2.addCell(bankName2);
            //table2.addCell(brCode2); 
            //table2.addCell(brAddr2);
            table2.addCell(amt2);
            
            table2.setWidthPercentage(100);
            float[] columnWidths = {20f, 20f, 20f,20f};

            table2.setWidths(columnWidths);
            document.add(table2);
            document.add(Chunk.NEWLINE);
            
            Paragraph banDetails = new Paragraph("");
            Chunk baDetails= new Chunk("BANKING DETAILS:");
            baDetails.setFont(font2);
            document.add(Chunk.NEWLINE);
            Chunk accNo = new Chunk("\n\nAccount number:");            
            Chunk brName = new Chunk("\n\nBank name:");            
            Chunk brCode = new Chunk("\n\nBranch code:");            
            Chunk brAddr = new Chunk("\n\nBranch Address:");            
            banDetails.add(baDetails);
            banDetails.add(accNo);
            banDetails.add(brName);
            banDetails.add(brCode);
            banDetails.add(brAddr);
            
            document.add(banDetails);
            //document.add(accNo);
            //document.add(brName);
            //document.add(brCode);
            //document.add(brAddr);
            document.add(Chunk.NEWLINE);
            Paragraph footerPara = new Paragraph();
            
            Chunk footerNotes = new Chunk("Make all cheques payable to ");
            Chunk footerNotes1 = new Chunk("[Your Company Name]");
            footerNotes1.setFont(new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD));
            footerPara.add(footerNotes);
            footerPara.add(footerNotes1);
            document.add(footerPara);            
            document.add(new Phrase("If you have any questions concerning this invoice, contact[Name, Phone Number, Email]"));
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
            Paragraph footerPara2 = new Paragraph();
            Chunk footerNotes2 = new Chunk("THANK YOU FOR YOUR BUSINESS!");
            footerNotes2.setFont(new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD));
            footerPara2.add(footerNotes2);
            footerPara2.setIndentationLeft(125.0f);
            document.add(footerPara2);
            System.out.println("Invoice Created Successfully!");
            
            document.close();
        } catch(Exception e){

        }
    
	}


}
