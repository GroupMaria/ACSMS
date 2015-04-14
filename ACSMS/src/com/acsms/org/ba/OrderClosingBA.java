package com.acsms.org.ba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.acsms.org.dao.CustomerDao;
import com.acsms.org.dao.OrderClosingDAO;
import com.acsms.org.vo.OrderClosingVO;
import com.acsms.org.vo.OrderVO;

/**
 * Servlet implementation class OrderClosingBA
 */
@WebServlet("/OrderClosingBA")
public class OrderClosingBA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderClosingBA() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");
		
		// Takes the order id to be closed
		String orderid = request.getParameter("OrderId");
		System.out.println("The passed Order Id "+orderid );
		OrderClosingVO closeOrder = new OrderClosingVO();
		closeOrder.setorderId(orderid);

		// DAO action for the Order ID
		OrderClosingDAO orderAction;
		try {
			orderAction = new OrderClosingDAO(closeOrder);
			orderAction.searchOrder();
			request.setAttribute("OrderClosingDetails", orderAction.getOrderClose());
			if(user.equals("staff"))
			{
			 RequestDispatcher submitview = request
					.getRequestDispatcher("/intermediateClosing.jsp");
			 submitview.forward(request, response);
			}
			else
			{
				RequestDispatcher submitview = request
						.getRequestDispatcher("/CustOrderStatus.jsp");
				submitview.forward(request, response);
			}
			
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}

		

	}



}
