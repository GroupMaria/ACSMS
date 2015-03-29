package com.acsms.org.ba;

import java.io.IOException;
import java.io.PrintWriter;

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
		String StatusId = request.getParameter("Status Id");
		OrderClosingVO objOrder = new OrderClosingVO(orderid, StatusId);
		
		//String orderid="";
		String Statusid = "";
		OrderClosingDAO objOrderClosingDAO = null;
		
		 //objOrderDao = null;
		try {
			OrderClosingDAO objOrderDao = new OrderClosingDAO();
			objOrderDao.searchOrder();
			//orderid= objCustomerDao.addNewCust();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		String Strorderid = constructJSON1(orderid);
		out.println(Strorderid);
	
	}
	
	private String constructJSON1(String Orderid) {

		JSONObject jsOrderClosing = new JSONObject();
		jsOrderClosing.put("Order Id", Orderid);
		return jsOrderClosing.toString();


}

}

