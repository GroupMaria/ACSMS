package com.acsms.org.ba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.QuotationDao;
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuotationVO quotation=new QuotationVO();
		quotation.setDatePrepared(request.getParameter("DatePrepared"));
		quotation.setProduct(request.getParameter("product"));
		quotation.setCustomer(request.getParameter("customer"));
		
		QuotationDao quoteDao=new QuotationDao(quotation);
		quoteDao.createNewQuote();
		
	}

}
