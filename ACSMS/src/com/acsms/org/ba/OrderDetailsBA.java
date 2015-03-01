package com.acsms.org.ba;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.OrderDetailsDao;
import com.acsms.org.vo.OrderDetailsVO;

/**
 * Servlet implementation class OrderDetailsBA
 */
@WebServlet("/OrderDetailsBA")
public class OrderDetailsBA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OrderDetailsBA() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String quotationId = request.getParameter("QuotationId");

		OrderDetailsDao objOrderDetailsDao = new OrderDetailsDao();

		OrderDetailsVO OrderDetails = objOrderDetailsDao
				.getOrderDetails(quotationId);

		request.setAttribute("OrderDetails", OrderDetails);

		RequestDispatcher view = request.getRequestDispatcher("/Order.jsp");

		view.forward(request, response);
	}

}
