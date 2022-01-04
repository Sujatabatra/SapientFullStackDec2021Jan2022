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
	<%@include file="header.jsp"%>
	
	<nav>
		<a href="./getallemployees">List All Employees</a><br> <br>
		<a href="./inputforemployeesearch.jsp">Search Employee By ID</a><br>
		<br> <a href="./employeeinputform.jsp">Insert Employee</a><br>
		<br> <a href="./inputforemployeedelete.jsp">Delete Employee</a><br>
		<br> <a href="">Update Employee</a><br> <br> <a href="">Generate
			PaySlip</a>
	</nav>
	
	<%@ include file="footer.jsp"%>
</body>
</html>