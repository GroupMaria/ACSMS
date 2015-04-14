package com.acsms.org.ba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.ApplicationUserDAO;
import com.acsms.org.vo.StaffVO;

/**
 * Servlet implementation class ApplicationUser
 */
@WebServlet("/ApplicationUser")
public class ApplicationUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("userID");
		String action = request.getParameter("action");
		String cpwd = request.getParameter("cpwd");
		String npwd = request.getParameter("npwd");
		
		StaffVO objStaffVo=new StaffVO();
		objStaffVo.setStaffid(userid);
		objStaffVo.setCpassword(cpwd);
		objStaffVo.setNpassword(npwd);
		ApplicationUserDAO objApplicationUser=new ApplicationUserDAO(objStaffVo);
		
		if(action.equals("changePassword"))
		{
			
				try
				{
				 if(objApplicationUser.updatePassword() >0)
				 {
					   request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
				 }
				 else
				 {
					  PrintWriter out = response.getWriter();
						out.println("No Staff Details Updated");
				 }
				
				}
				catch(Exception e)
				{
					PrintWriter out = response.getWriter();
					out.println("No Staff Details Updated");
				}
			
		}
	}

}
