package com.acsms.org.ba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.CustomerDao;
import com.acsms.org.dao.StaffDao;
import com.acsms.org.vo.CustomerVO;
import com.acsms.org.vo.StaffVO;

/**
 * Servlet implementation class StaffBA
 */
@WebServlet("/StaffBA")
public class StaffBA extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public StaffBA() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String Title = request.getParameter("combTitle");
		String FName = request.getParameter("txtFName");
		String LName = request.getParameter("txtLName");
		String Phone = request.getParameter("txtPhone");
		String Email = request.getParameter("txtEmail");
		boolean isAdmin = Boolean.parseBoolean(request.getParameter("isAdmin"));
		
		StaffVO staff =new StaffVO(Title, FName, LName, Phone, Email,isAdmin);		
		StaffDao objstaffDao = new StaffDao(staff);
		
		String Action=request.getParameter("Action");
		
		if(Action == "Add")
		{
		    objstaffDao.addStaff();
		}
		
		if(Action == "Update")
		{
		    objstaffDao.updateStaff();
		}

		if(Action == "Delete")
		{
		   objstaffDao.deleteStaff();
		}
	}

}
