package com.acsms.org.ba;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.OrderDetailsDao;
import com.acsms.org.dao.QuotationDao;
import com.acsms.org.vo.OrderDetailsVO;
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

		QuotationVO quotation = new QuotationVO();
		quotation.setDatePrepared(request.getParameter("DatePrepared"));
		quotation.setProduct(request.getParameter("product"));
		quotation.setCustomer(request.getParameter("customer"));
		quotation.setShippingFrom(request.getParameter("ShippingFrom"));
		quotation.setDestinationCountry(request
				.getParameter("destinationCountry"));
		quotation.setTermsOfPayment(request.getParameter("termsOfPayment"));
		quotation.setModeofTransport(request.getParameter("modeofTransport"));
		quotation.setRefNumber(request.getParameter("refNumber"));
		quotation.setEstimatedShipDate(request
				.getParameter("EstimatedShipDate"));
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
		quotation.setInlandFreightothers(request
				.getParameter("inlandFreightothers"));
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
		quotation.setTotalExportquotation("");

		QuotationDao quoteDao = new QuotationDao(quotation);
		quoteDao.createNewQuote();

		request.setAttribute("QuoteDetails", quotation);

		RequestDispatcher view = request
				.getRequestDispatcher("/intermediate.jsp");

		view.forward(request, response);

	}

}
