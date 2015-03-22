package com.acsms.org.ba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.CustomerDao;
import com.acsms.org.dao.OrderClosingDAO;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String orderid = request.getParameter("Order Id");
		OrderVO objOrder = new OrderVO(orderid);
		
		 //objOrderDao = null;
		try {
			OrderClosingDAO objOrderDao = new OrderClosingDAO(objOrder);
			objOrderDao.searchOrder();
			//orderid= objCustomerDao.addNewCust();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
