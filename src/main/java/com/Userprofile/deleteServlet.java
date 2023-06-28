package com.Userprofile;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


String id = request.getParameter("stfid");
		
		boolean isTrue;
		
		isTrue = customerDBUtil.deletemployee(id);
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    out.println("<html><body>");
		    
		
		if(isTrue == true) {
			out.println("<script>alert('Successfully Deleted!')</script>");
			RequestDispatcher dis = request.getRequestDispatcher("userInsert.jsp");
			dis.forward(request, response);
		}else {
			
			List<Staff> staffDetails=customerDBUtil.getStaffDetails(id);
			request.setAttribute("staffDetails", staffDetails);
			RequestDispatcher dis = request.getRequestDispatcher("userAccount.jsp");
			dis.forward(request, response);
		}	
		
		
		
		
		
		
		
		
	}

}
