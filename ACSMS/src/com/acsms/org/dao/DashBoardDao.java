package com.acsms.org.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DashBoardDao
 */
@WebServlet("/DashBoardDao")
public class DashBoardDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
               
        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
        	
        	String firstName = req.getParameter("fname");
        	String lastName = req.getParameter("lname");
        	String tableName = req.getParameter("tname");
     
        	String data=null;
      	  int done=0;
      	  int notDone=0;
        	
        try{
        	//STEP 2: Register JDBC driver
        	  Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection        		   
        	  Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost/asms","root",null);       		        		        	         			  
        	  Statement stmt = connection.createStatement();
        	 
        	 // String selectDataSQL = "SELECT  status,count(*) as total FROM ORDER group by status";
        	  String selectDataSQL = " select case  when orderstatus = 'Order Completed' then 'Y' else 'N' end as status, count(*) as total from orders group by orderstatus";
     	       ResultSet rs = stmt.executeQuery(selectDataSQL);
     	      while(rs.next()){
     	    	  data =rs.getString("status");
     	    	 if (data.equals("Y"))
     	    	 {
     	    		 done=rs.getInt("total");
     	    	 }else
     	    	 {
     	    		notDone=rs.getInt("total");
     	    	 }   	    		    	 
     	     }       	      	       
	     rs.close();
	     stmt.close();
	     connection.close();
	      }
	   
	    catch (Exception ex) {
	      ex.printStackTrace();	      
	    }
        String xx=	done+"-"+notDone;
        res.sendRedirect( "dashBoard.jsp?toJsp="+xx);
       // res.sendRedirect( "dashBoard.jsp?toJspnotDone="+notDone);
     	  }       
      }
           	   	   
 

