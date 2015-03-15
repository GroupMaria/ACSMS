package com.acsms.org.ba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.CustomerDao;
import com.acsms.org.vo.CustomerVO;

/**
 * Servlet implementation class CustomerBA
 */
@WebServlet("/CustomerBA")
public class CustomerBA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerBA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String custTitle = request.getParameter("combTitle");
		String custFName = request.getParameter("txtFName");
		String custLName = request.getParameter("txtLName");
		String custCompany = request.getParameter("txtCompany");
		String custStreet = request.getParameter("txtStreet");
		String custCity = request.getParameter("txtCity");
		String custProvince = request.getParameter("combProvince");
		String custPosCod = request.getParameter("txtPosCod");
		String custCountry = request.getParameter("txtCountry");
		String custPhone = request.getParameter("txtPhone");
		String custEmail = request.getParameter("txtEmail");
		
		CustomerVO objCustomer =new CustomerVO(custTitle, custFName, custLName, custCompany, custStreet, custCity, custProvince, custPosCod, custCountry, custPhone, custEmail);		
		CustomerDao objCustomerDao = new CustomerDao(objCustomer);
		
//		objCustomerDao.addNewCust();
			
		PrintWriter out = response.getWriter();
		out.println(custTitle);
		
	}

}
