<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Login Form</title>
    <style>
      form {
        max-width: 500px;
        margin: 0 auto;
        background-color: #6c5ce7; /* Change background color to blue (#007bff) */
        padding: 60px;
        border-radius: 15px;
        box-shadow: 0 14px 28px rgb(0, 0, 0);
        margin-top: 150px;
      }

      body {
        background: #ffffff;
      }

      h1 {
        color: #ffffff;
        font-size: 32px;
        text-align: center;
        margin-bottom: 20px;
        font-weight: bold;
      }

      label {
        display: block;
        margin-bottom: 10px;
        font-weight: bold;
        font-size: 24px;
        color: #ffffff;
      }

      input[type="text"],
      input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
      }

	  /*submit button*/
      input[type="submit"] {
        display: block;
        width: 120px;
        margin: 0 auto; /* center the submit button horizontally */
        background-color: #ffffff; /* Change background color to white (#ffffff) */
        color: #6c5ce7; /* Change text color to blue (#007bff) */
        padding: 12px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
        font-size: 20px;
        font-family: Arial, sans-serif;
      }
      
	  /*hover background colour*/
      input[type="submit"]:hover {
        background-color: #e3e3e3; 
      }
    </style>

   
  </head>
  <body>
    <form action ="login" method ="POST">
    
      <h1>Login Form</h1>
      
      <label for="username">Username:</label>
      <input type="text" id="username" name="username2">
      
      <label for="password">Password:</label>
      <input type="password" id="password" name="password2">
      
      <input type="submit" name="submit" value="Login" onclick="validate()">
      
    </form>
  </body>
</html>
