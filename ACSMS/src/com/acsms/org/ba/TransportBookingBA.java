package com.acsms.org.ba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.CustomerDao;
import com.acsms.org.dao.TransportBookingDAO;
import com.acsms.org.vo.TransportBookingVO;

/**
 * Servlet implementation class TransportBookingBA
 */
@WebServlet("/TransportBookingBA")
public class TransportBookingBA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransportBookingBA() {
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
		String crrName = request.getParameter("crrName");
		String crrbookID = request.getParameter("crrbookID");
		String trnsName = request.getParameter("trnsName");
		String trnsbookID = request.getParameter("trnsbookID");
		String invoice_id = request.getParameter("invoice_id");
			
		TransportBookingVO objTransportBooking = new TransportBookingVO(crrName,crrbookID,trnsName,trnsbookID,invoice_id);		
			
		//String Custid="";
		TransportBookingDAO objTransportBookingDAO = null;
		try {
			objTransportBookingDAO = new TransportBookingDAO(objTransportBooking);
			objTransportBookingDAO.addNewTransportBooking();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
}
