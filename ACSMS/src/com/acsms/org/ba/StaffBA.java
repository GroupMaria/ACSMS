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
import com.sun.org.apache.xml.internal.resolver.helpers.Debug;
import org.json.JSONObject;

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
	
	
		String staffId="";
		
		if(request.getParameter("staffId") != null)
		{
		    staffId = request.getParameter("staffId");
		}
		String Title = request.getParameter("combTitle");
		String FName = request.getParameter("txtFName");
		String LName = request.getParameter("txtLName");
		String Phone = request.getParameter("txtPhone");
		String Email = request.getParameter("txtEmail");
		boolean isAdmin = Boolean.parseBoolean(request.getParameter("isAdmin"));
		
		StaffVO staff =new StaffVO(staffId,Title, FName, LName, Phone, Email,isAdmin);		
		StaffDao objstaffDao = null;
		
		try {
			objstaffDao = new StaffDao(staff);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String Action=request.getParameter("toaction");
		
		if(Action.equals("Search"))
		{
			staff= objstaffDao.getStaffByID(staffId);
		
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			String StrStaff=constructJSON(staff);
			out.println(StrStaff);
		}
	
		if(Action.equals("Add"))
		{
			PrintWriter out = response.getWriter();
			out.println("Add");
		    objstaffDao.addStaff();
		}
		
		if(Action.equals("Update"))
		{
			PrintWriter out = response.getWriter();
			out.println("Update");
		    objstaffDao.updateStaff();
		}

		if(Action.equals("Delete"))
		{
		    objstaffDao.deleteStaff();
		}
	}

	private String constructJSON(StaffVO staff) {
		
		JSONObject jsStaff = new JSONObject();
		jsStaff.put("staffId", staff.getStaffid());
		jsStaff.put("combTitle",staff.getstaffTitle());
		jsStaff.put("txtFName", staff.getstaffFName());
		jsStaff.put("txtLName",staff.getstaffLName());
		jsStaff.put("txtPhone",staff.getstaffPhone());
		jsStaff.put("txtEmail", staff.getstaffEmail());
		jsStaff.put("isAdmin", staff.isAdmin());

		return jsStaff.toString();
	}

	
}
