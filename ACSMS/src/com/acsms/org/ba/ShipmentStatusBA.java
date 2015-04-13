package com.acsms.org.ba;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.ShipmentStatusDAO;
import com.acsms.org.vo.OrderStatusVO;

/**
 * Servlet implementation class ShipmentStatusBA
 */
@WebServlet("/ShipmentStatusBA")
public class ShipmentStatusBA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShipmentStatusBA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Takes the order id to be closed
		String orderid = request.getParameter("OrderId");
		String status = request.getParameter("Status");
		String date = request.getParameter("sDate");
		
		OrderStatusVO statusVO=new OrderStatusVO();
		statusVO.setOrderid(orderid);
		statusVO.setStatus(status);
		statusVO.setDate(date);
		ShipmentStatusDAO shipStatus;
		try {
			shipStatus = new ShipmentStatusDAO(statusVO);
			shipStatus.updateStatus();
			RequestDispatcher submitview = request
					.getRequestDispatcher("/index.jsp");
			submitview.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
