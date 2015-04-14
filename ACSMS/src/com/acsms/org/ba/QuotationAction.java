package com.acsms.org.ba;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.QuotationDao;
import com.acsms.org.vo.QuotationVO;

/**
 * Servlet implementation class QuotationAction
 */
@WebServlet("/QuotationAction")
public class QuotationAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuotationAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
	     /* response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
		  String title = "Reading All Form Parameters";
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      out.println(docType +
	    	        "<html>\n" +
	    	        "<head><title>" + title + "</title></head>\n" +
	    	        "<body bgcolor=\"#f0f0f0\">\n" +
	    	        "<h1 align=\"center\">" + title + "</h1>\n" +
	    	        "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
	    	        "<tr bgcolor=\"#949494\">\n" +
	    	        "<th>Param Name</th><th>Param Value(s)</th>\n"+
	    	        "</tr>\n");
	    	      Enumeration paramNames = request.getParameterNames();
	    	      
	    	      while(paramNames.hasMoreElements()) {
	    	         String paramName = (String)paramNames.nextElement();
	    	         out.print("<tr><td>" + paramName + "</td>\n<td>");
	    	         String[] paramValues =
	    	                request.getParameterValues(paramName);
	    	         // Read single valued data
	    	         if (paramValues.length == 1) {
	    	           String paramValue = paramValues[0];
	    	           if (paramValue.length() == 0)
	    	             out.println("<i>No Value</i>");
	    	           else
	    	             out.println(paramValue);
	    	         } else {
	    	             // Read multiple valued data
	    	             out.println("<ul>");
	    	             for(int i=0; i < paramValues.length; i++) {
	    	                out.println("<li>" + paramValues[i]);
	    	             }
	    	             out.println("</ul>");
	    	         }
	    	      }
	    	      out.println("</tr>\n</table>\n</body></html>");
	      
*/
		QuotationVO quotation = new QuotationVO();
		quotation.setDatePrepared(request.getParameter("DatePrepared"));
		quotation.setProduct(request.getParameter("product"));
		quotation.setCustomer(request.getParameter("customer"));
		quotation.setShippingFrom(request.getParameter("shippingFrom"));
		quotation.setDestinationCountry(request
				.getParameter("destinationCountry"));
		quotation.setTermsOfPayment(request.getParameter("termsOfPayment"));
		quotation.setModeofTransport(request.getParameter("modeofTransport"));
		quotation.setRefNumber(request.getParameter("refNumber"));
		quotation.setEstimatedShipDate(request
				.getParameter("estimatedShipDate"));
		quotation.setPackedDimensions(request.getParameter("packedDimensions"));
		quotation.setShippingTo(request.getParameter("ShippingTo"));
		quotation.setPackedWeight(request.getParameter("packedWeight"));
		quotation.setPackedCube(request.getParameter("packedCube"));
		quotation.setProductSellingPrice(request
				.getParameter("productSellingPrice"));
		quotation.setProductSellingPriceQuote(request
				.getParameter("productSellingPriceQuote"));
		quotation.setSellingPriceQuotedBy(request
				.getParameter("sellingPriceQuotedBy"));
		quotation.setInlandFreight(request.getParameter("inlandFreight"));
		quotation.setInlandFreightQuote(request
				.getParameter("inlandFreightQuote"));
		quotation.setInlandFreightQuotedBy(request
				.getParameter("inlandFreightQuotedBy"));
		
		
		quotation.setInlandUnloading("Unloading");
		quotation.setInland_Pier_deliver("PierDelivery");
		quotation.setInland_terminal_handle("TerminalHandling");
		quotation.setInland_other("Others");
		quotation.setInlandFreightothers1(request
				.getParameter("inlandFreightothers"));
		
		quotation.setInlandFreightothers1(request.getParameter("InternationalFreightPrice"));
		quotation.setInternationalFreightQuote1(request
				.getParameter("InternationalFreightQuote1"));
		quotation.setInternationalFreightQuotedBy(request
				.getParameter("InternationalFreightQuotedBy"));
		
		
		
		
		quotation.setForwardingFees(request.getParameter("ForwardingFees"));
		quotation.setConsularPrice(request.getParameter("ConsularPrice"));
		quotation.setInspectionFees(request.getParameter("InspectionFees"));
		quotation.setBankingCharges(request.getParameter("BankingCharges"));
		quotation.setOtherCharges(request.getParameter("OtherCharges"));
		quotation.setOtherCharge1(request.getParameter("OtherCharge1"));
		quotation.setOtherCharge1Name(request.getParameter("OtherCharge1Name"));
		quotation.setOtherCharge2(request.getParameter("OtherCharge2"));
		quotation.setOtherCharge2Name(request.getParameter("OtherCharge2Name"));
		quotation.setInlandFreightothers1(request.getParameter("OtherCharge2Name"));
		//TODO: Should write the logic for the total export value
		
		quotation.setTotalExportquotation(request.getParameter("TotalExportquotation"));
		System.out.println("Total Export Quotation"+quotation.getTotalExportquotation());

		QuotationDao quoteDao = new QuotationDao(quotation);
		quoteDao.createNewQuote();

		request.setAttribute("QuoteDetails", quotation);
		RequestDispatcher view = request
				.getRequestDispatcher("/NewOrder.jsp");
		view.forward(request, response);

	}

}