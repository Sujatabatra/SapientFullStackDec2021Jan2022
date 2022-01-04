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
	<nav>
		<a href="">List All Employees</a><br>
		<br> <a href="">Search Employee By ID</a><br>
		<br> <a href="./employeeinputform.jsp">Insert Employee</a><br>
		<br> <a href="./inputforemployeedelete.jsp">Delete Employee</a><br>
		<br> <a href="">Update Employee</a><br>
		<br> <a href="">Generate PaySlip</a>
	</nav>
	<footer>
		<h4>This demo is the registered trade mark of Sujata Batra&reg;</h4>
		<h5>Created for Batch SFCC</h5>
	</footer>
</body>
</html>