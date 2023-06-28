package com.Userprofile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	     
		String username2  = request.getParameter("username2"); //getting userinputs from the jsp and store that values in variables
		String password2  = request.getParameter("password2");
		
		boolean isTrue ;
		
		 isTrue = customerDBUtil.validateLogin(username2, password2);
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("<html><body>");
		
		if(isTrue == true) {
			
			
			 
			
	    	out.println("<script>window.location.href='index.jsp';</script>"); //redirect to the index page
	    	
			
			
		}else {
			
			 out.println("<script>alert('Your UserName or Password Invalid!')</script>");
	    	 out.println("<script>window.location.href='login.jsp';</script>");
			
			
		}

		
		
		
		
		
		
		
		
	}

}
