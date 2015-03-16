package com.acsms.org.ba;

import java.io.IOException;
import java.sql.SQLException;

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
		OrderDetailsDao objOrderDetailsDao;

			try {
				objOrderDetailsDao = new OrderDetailsDao();
			
			// TODO: Check whether the Order Id is already generated
			boolean checkQuotationId;
			checkQuotationId = objOrderDetailsDao.checkQuotationId(quotationId);
			if (checkQuotationId) {

				System.out.println("New Order Id has to be generated");
				// TODO : else New Order Id has to be generated
				objOrderDetailsDao.generateOrderDetails(quotationId);
				OrderDetailsVO OrderDetails = objOrderDetailsDao
						.getOrderDetails(quotationId);
				request.setAttribute("OrderDetails", OrderDetails);
				RequestDispatcher submitview = request
						.getRequestDispatcher("/OrderSubmit.jsp");
				submitview.forward(request, response);

			} else {
				System.out
						.println("if Order id is already present in the database , then show that the id is generated.");
				// TODO : if Order id is already present in the database , then
				// show that the id is generated.
				OrderDetailsVO OrderDetails = objOrderDetailsDao
						.getOrderDetails(quotationId);
				request.setAttribute("OrderDetails", OrderDetails);
				RequestDispatcher view = request
						.getRequestDispatcher("/Order.jsp");

				view.forward(request, response);
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
