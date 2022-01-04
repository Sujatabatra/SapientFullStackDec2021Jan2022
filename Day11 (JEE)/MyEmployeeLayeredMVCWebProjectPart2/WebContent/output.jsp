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

	<%@ include file="header.jsp"%>
	<main>

		<h3>${requestScope.message}</h3>

		<a href="./employeemenu.jsp">Go To Main Menu</a>
	</main>

	<%@ include file="footer.jsp"%>
</body>
</html>