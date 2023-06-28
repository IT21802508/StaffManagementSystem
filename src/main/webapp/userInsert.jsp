<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@2.0.7/css/boxicons.min.css">
<link rel="stylesheet" href="indexstyle.css">

<title>Add Staff</title>

<style>
    
    body {
        font-family: Arial, sans-serif;
        background-color: #ccc;
    }
    
    h1 {
        color: #6c5ce7;
        font-size: 28px;
        font-weight: bold;
        margin-bottom: 20px;
        text-align: center;
    }
    
    form {
        max-width: 510px;
        max-height: 900px;
        margin: 0 auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 15px;
        box-shadow: 0 14px 28px rgb(0, 0, 0);
    }
    
    input[type=text], input[type=number] {
        width: 450px;
        height:20px;
        padding: 12px 20px;
        margin: 8px 0;
        box-sizing: border-box;
        border: 3px solid #ccc;
        border-radius: 6px;
    }
    
    input[type=submit] {
        background-color: #6c5ce7;
        color: #ccc;
        padding: 12px 18px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        margin-left:200px;
    }
    
    input[type=submit]:hover {
        background-color: #6c5ce7;
    }
    
    .button-container {
        display: flex;
        justify-content: center;
    }
</style>

</head>
<body>
<!-- SIDEBAR -->
	<section id="sidebar">
		<a href="#" class="brand">
			<i class='bx bxs-graduation'></i>
			<span class="text"><h2>BrightMind</h2></span>
		</a>
		<ul class="side-menu top">
			
			<li>
				<a href="userInsert.jsp">
					<i class='bx bxs-group' ></i>
					<span class="text">Manage Staff</span>
				</a>
			</li>
			<li>
				<a href="userAccount.jsp">
					<i class='bx bxs-credit-card' ></i>
					<span class="text">Staff Salary</span>
				</a>
			</li>
			<li>
				<a href="userAccount.jsp">
					<i class='bx bxs-calendar-check' ></i>
					<span class="text">Shift Schedule</span>
				</a>
			</li>
			<li>
				<a href="userAccount.jsp">
					<i class='bx bxs-message-square-add' ></i>
					<span class="text">Manage Leaves</span>
				</a>
			</li>
		</ul>
		<ul class="side-menu">
			<li>
				<a href="#">
					<i class='bx bxs-cog' ></i>
					<span class="text">Settings</span>
				</a>
			</li>
			<li>
				<a href="#" class="logout">
					<i class='bx bxs-log-out-circle' ></i>
					<span class="text">Logout</span>
				</a>
			</li>
		</ul>
	</section>
	<!-- SIDEBAR -->

  <h1> Add Staff Details</h1>
    
 <form action="insert" method="POST">
 
 
 
 
Name:<br> <input type="text" name="name" required>   <br>
Home Address:<br> <input type="text" name="homeaddress" required>   <br>
Email Address:<br> <input type="text" name="email" required>
<span class="error"> ${validationMessage}</span>   <br>
Contact No:<br> <input type="text" name="phone" required>   <br>

Emergency Contact No:<br><input type="text" name="emergnecycontact" required>   <br><br>
Date of joining: <br> <input type="date" name="doj" required>   <br><br>
Job title:<br><input type="text" name="jobtitle" required>  <br>
Staff Status:<br><input type="text" name="status" required>   <br>
Department:<br> <input type="text" name="department" required>   <br>
Position:<br> <input type="text" name="position" required>   <br>


					
<input type="submit" value="Add Staff">
    
       
    </form>
    
</body>
</html>
