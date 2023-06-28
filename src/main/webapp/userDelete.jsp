<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>



.staff-details-container {
  margin: 50px auto;
  width: 80%;
  margin-top: 50px; /* Increased margin top value */
 }

h2 {
  font-size: 30px;
  margin-bottom: 10px;
  margin-left:150px;
}

table {
  border-collapse: collapse;
  width: 100%;
  border: 15px solid white;
  border-radius:10px;
}

th {
  padding: 8px;
  text-align: centre;
  vertical-align: middle;
   background-color:#6c5ce7;
   }
td{
background-color:#6c5ce7;


}

th {
  background-color: #f2f2f2;
  font-weight: bold;
}

tbody tr:nth-child(even) {
  background-color:#6c5ce7;
}

tbody tr:hover {
  background-color: #ddd;
}

input[type="submit"] {
  background-color: black;
  color: white;
  padding: 14px 20px;
  margin: center;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  margin-left:230px;
}

input[type="submit"]:hover {
  background-color:#0000FF ;
}

input[type="text"]:hover {
  background-color:#0000FF ;
}

input[type="text"] {
  background-color:#blue;
  width:48;
   height:48;
}
form { 
        max-width: 550px;
        max-height: 600px;
        margin: 0 auto;
        background-color: #6c5ce7;
        padding: 20px;
        border-radius: 15px;
        box-shadow: 0 14px 28px rgb(0, 0, 0);
        margin-top:50px
    }
    









</style>
</head>
<body>

<%


String stfid=request.getParameter("stfid");
String name=request.getParameter("name");
String address=request.getParameter("address");
String email=request.getParameter("email");
String contactno=request.getParameter("contactno");
String emergencyno=request.getParameter("emergencyno");
String doj = request.getParameter("doj");
String jobtitle=request.getParameter("jobtitle");
String status=request.getParameter("status");
String department =request.getParameter("department");


%>


<form action="delete" method="post">




<div class="staff-details-container">
  <h2>Staff Details</h2>
<table >
    <thead>
      <tr>
        <th>Staff ID</th>
        <td><input type="text" name="stfid" value="<%=stfid%>" readonly></td>
      </tr>
       <tr>
        <th>Name</th>
        <td><input type="text" name="name" value="<%= name%>" readonly></td>
      </tr>
       <tr>
        <th>Address</th>
        <td><input type="text" name="address"   value="<%= address%>" readonly></td>
      </tr>
       <tr>
        <th>Email</th>
        <td><input type="text" name="email" value="<%=email%>" readonly></td>
      </tr>
       
        <tr>
        <th>Contact no</th>
        <td><input type="text" name="contactno" value="<%=contactno%>" readonly></td>
        </tr>
       <tr>
       
        <th>Emergency Contact no</th>
        <td><input type="text" name="emergencyno" value="<%=emergencyno %>" readonly></td>
      </tr>
      
        <tr>
        <th>Date of Joined</th>
        <td><input type="text" name="doj" value="<%=doj%>" readonly></td>
        </tr>
      <tr>
        <th>Job Title</th>
        <td><input type="text" name="jobtitle" value="<%=jobtitle%>" readonly></td>
      </tr>
      <tr>
        <th>Job Status</th>
        <td> <input type="text" name="status" value="<%=status%>" readonly></td>
      </tr>
     <tr>
        <th>Department</th>
        <td><input type="text" name="department" value="<%=department %>" readonly></td>
      </tr>  
       
       
   </thead>
   
</table>
</div>



<input type="submit" name="submit" value="delete">


</form>





</body>
</html>