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
		<form action="./delete" method="post">
			Enter Employee Id to be deleted <input type="text" name="empId"><br>
			<br> <input type="submit" value="Delete Employee">
		</form>
	</main>
	
	<footer>
		<h4>This demo is the registered trade mark of Sujata Batra&reg;</h4>
		<h5>Created for Batch SFCC</h5>
	</footer>

</body>
</html>