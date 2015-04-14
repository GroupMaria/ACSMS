package com.acsms.org.ba;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.acsms.org.dao.ReportingDao;


/**
 * Servlet implementation class InvoiceSearch
 */
public class InvoiceSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InvoiceSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Inside doPost Search" + request.getParameter("invoiceNumber"));
		ReportingDao dao = new ReportingDao();
		Report report = dao.getReportData(request.getParameter("invoiceNumber"));
		if (report == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			request.setAttribute("error", "Invalid Invoice No");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("report.jsp");
			request.setAttribute("report", report);
			dispatcher.forward(request, response);
		}
	}

}
