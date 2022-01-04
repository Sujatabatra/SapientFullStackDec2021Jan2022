<%@page import="com.sujata.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>Employee Management System</h1>
		<h2>
			Welcome,
			<%
		User user = (User) application.getAttribute("user");
		out.println(user.getUsername().toUpperCase());
		%>!
		</h2>
	</header>
	
	<main>
		<form action="./save" method="post">
			Enter Employee ID : <input type="text" name="empId"><br>
			<br> Enter Employee Name : <input type="text" name="empName"><br>
			<br> Select Employee Designation : <select name="empDesig">
				<option value="Executive">Executive</option>
				<option value="Associate">Associate</option>
				<option value="Sr. Associate">Sr. Associate</option>
				<option value="Manager">Manager</option>
				<option value="Sr. Manager">Sr. Manager</option>
			</select><br> <br> Enter Employee Department : <input type="radio"
				name="empDeptt" value="Sales">Sales <input type="radio"
				name="empDeptt" value="IT">IT <input type="radio"
				name="empDeptt" value="Purchase">Purchase <input
				type="radio" name="empDeptt" value="Marketing">Marketing <input
				type="radio" name="empDeptt" value="Admin">Admin<br> <br>
			Enter Employee Salary : <input type="text" name=empSalary><br>
			<br> <input type="submit" value="Save Employee">
		</form>
	</main>
	
	<footer>
		<h4>This demo is the registered trade mark of Sujata Batra&reg;</h4>
		<h5>Created for Batch SFCC</h5>
	</footer>


</body>
</html>