package com.Userprofile;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 
		String id = request.getParameter("stfid");
		
		try {
			
			
			List<Staff> staffDetails=customerDBUtil.getStaffDetails(id);
			
			request.setAttribute("staffDetails", staffDetails);
			
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		RequestDispatcher dis =request.getRequestDispatcher("userAccount.jsp");
        dis.forward(request, response);
}
}