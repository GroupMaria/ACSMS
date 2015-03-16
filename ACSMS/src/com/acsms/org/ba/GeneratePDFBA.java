package com.acsms.org.ba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.ConvertHTMLToPDF;
import com.acsms.org.dao.GeneratePdf;

/**
 * Servlet implementation class GeneratePDFBA
 */
@WebServlet("/GeneratePDFBA")
public class GeneratePDFBA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneratePDFBA() {
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
		GeneratePdf pdfba=new GeneratePdf();
		//pdfba.generatePDF();
		ConvertHTMLToPDF  pdf=new ConvertHTMLToPDF();
		pdf.createPDF("OrderDetails.pdf", getServletContext().getRealPath("Sample.html"));
	}

}
