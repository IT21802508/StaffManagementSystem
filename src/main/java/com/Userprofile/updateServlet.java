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


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String stfid=request.getParameter("stfid");	
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String email=request.getParameter("email");
	String contactno =request.getParameter("contactno")	;
	String emergencyno=request.getParameter("emergencyno");
	String doj=request.getParameter("doj");
	String jobtitle=request.getParameter("jobtitle");
	String jobstatus=request.getParameter("status");
	String department=request.getParameter("department");
		
	
	boolean isTrue;
	
	isTrue=customerDBUtil.updateCustomer(stfid, name, address, email, contactno, emergencyno, doj, jobtitle, jobstatus, department);
	
	
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html><body>");
	if(isTrue==true) {
		out.print("Updated");
		List<Staff> staffDetails = customerDBUtil.getStaffDetails(stfid);
		request.setAttribute("staffDetails", staffDetails);
		
		RequestDispatcher dis=request.getRequestDispatcher("userAccount.jsp");
		dis.forward(request, response);
	}else {
		RequestDispatcher dis=request.getRequestDispatcher("unsuccess.jsp");
		dis.forward(request, response);
		
		
		
	}
	
	}

}
