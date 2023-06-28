package com.Userprofile;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertServlet")
public class insertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	String name = request.getParameter("name");
	String address=request.getParameter("homeaddress");
	String email =request.getParameter("email");
	String contactno = request.getParameter("phone");
	String emergencyno = request.getParameter("emergnecycontact");
    String doj = request.getParameter("doj");
    String title = request.getParameter("jobtitle");
    String status =request.getParameter("status");
    String department=request.getParameter("department");
   String position =request.getParameter("position");
    
  
   // Validate the email
   boolean isEmailValid = EmailValidator.validateEmail(email);
   
   if (!isEmailValid) {
       // If email is not valid, display an error message
       request.setAttribute("validationMessage", "Invalid email format");
       RequestDispatcher dispatcher = request.getRequestDispatcher("userInsert.jsp");
       dispatcher.forward(request, response);
       return; // Stop further processing
   }
   
   
   
    boolean isTrue;
    isTrue =customerDBUtil.insertStaff(name, address, email, contactno, emergencyno, doj, title, status, department, position);
    
    
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    
    
    Staff staff;
    
    if(status.equals("permenant")) {
      staff = new permenantStaff(  0, name, address, email, contactno, emergencyno, doj, title, status, department, position);
    }else if(status.equals("visiting")){
    	
    	
    	
    	
    }
    
    

    if(isTrue) {
    	
    	 out.println("<script>alert('Successfully Inserted!')</script>");
    	 out.println("<script>window.location.href='index.jsp';</script>");
    	
    }else {
    	
    	 out.println("<script>alert('Insertion Unsuccessful!')</script>");
    	 out.println("<script>window.location.href='userInsert.jsp';</script>");
    	
    	
    }
 
	
    
		
	}
	
	
	
    }

	
	