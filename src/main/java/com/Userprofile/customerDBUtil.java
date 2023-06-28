package com.Userprofile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerDBUtil {
	
	
	
	private static boolean isSuccess;
	private static Connection con =null;
    private static Statement stmt=null;
    private static ResultSet rs=null;
    
    
    
    
    
	
   public static boolean insertStaff (String name , String address , String email,String contactno , String emergencyno,String doj,String jobtitle,String status,String department,String position ) {
	
	boolean isSuccess=false ;
	
	//create dbconnection
	
	String url = "jdbc:mysql://localhost:3306/staff";
	String userName="root";
	String password="hashini123";
	
	try {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con  = DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		
		
		
		String sql = "insert into staffdetails values(0,'"+name+"','"+address+"','"+email+"','"+contactno+"','"+emergencyno+"','"+doj+"','"+jobtitle+"','"+status+"','"+department+"','"+position+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			isSuccess = true ;
		}else {
			
			isSuccess = false;
		}
		
	}catch (Exception e) {
		
		
		e.printStackTrace();
	}

	
	
	
	return isSuccess;
}


	
	
public static List<Staff> getStaffDetails(String id){
	
	//create dbconnection
	
	
	String url = "jdbc:mysql://localhost:3306/staff";
	String userName="root";
	String password="hashini123";
	
	
	
	
	int convertedId=Integer.parseInt(id);
	ArrayList<Staff> stf =  new ArrayList<>();
	
	
	
	
	try {
		
	
		
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection con  = DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		
		String sql = "select * from staffdetails where staffid='"+convertedId+"'";
	    rs=stmt.executeQuery(sql);
		
		
		
	   while(rs.next()) {
			
			
			int id1 =rs.getInt(1);
			String name=rs.getString(2);
			String address=rs.getString(3);
			String email=rs.getString(4);
			String contactno=rs.getString(5);
			String emergencyno=rs.getString(6);
			String doj = rs.getString(7);
			String title=rs.getString(8);
			String status=rs.getString(9);
			String department=rs.getString(10);
			
			
			
			
			Staff staff= new Staff(id1,name,address,email,contactno,emergencyno,doj,title,status,department);
			stf.add(staff);
		}

		
		
		
		
		
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	
	
	
	
	return stf;
}


public static boolean updateCustomer(String id,String name,String address,String email,String contactno,String emergencyno,String doj,String title,String status,String department ) {
	
	String url = "jdbc:mysql://localhost:3306/staff";
	String userName="root";
	String password="hashini123";
	
	
try {
		
	
		
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection con  = DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		
		String sql = "update staffdetails set name='"+name+"',address='"+address+"',email='"+email+"',contactno='"+contactno+"',emergencyno='"+emergencyno+"',doj='"+doj+"',jobtitle='"+title+"',status='"+status+"',department='"+department+"'"+ "where staffid='"+id+"'";
		int rs=stmt.executeUpdate(sql);
		
		if(rs>0) {
			
			
			isSuccess= true;
			
		}else {
			
			isSuccess=false;
		}
		
		
}catch(Exception e) {
	
	e.printStackTrace();
}
	return isSuccess;
}
	

public static boolean deletemployee(String id) {
	
	
	

	String url = "jdbc:mysql://localhost:3306/staff";
	String userName="root";
	String password="hashini123";
	
	int convertedID = Integer.parseInt(id);
	
	try {
		
		   Class.forName("com.mysql.jdbc.Driver");
			
		   Connection con  = DriverManager.getConnection(url,userName,password);
		   Statement stmt=con.createStatement();
		
		String sql = "delete from staffdetails where staffid='"+convertedID+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}





public static boolean validateLogin(String username2, String password2) {
	
	boolean isSuccess=false ;

	String url = "jdbc:mysql://localhost:3306/staff";
	String userName="root";
	String password="hashini123";
	
	try {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con  = DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		
		
		
		String sql = "select * from login where username='"+username2+"' && password='"+password2+"'";
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
            isSuccess = true; // User authenticated
        } else {
            isSuccess = false; // User not authenticated
        }
	}catch (Exception e) {
		
		
		e.printStackTrace();
	}

	
	
	
	return isSuccess;
}


	



}
