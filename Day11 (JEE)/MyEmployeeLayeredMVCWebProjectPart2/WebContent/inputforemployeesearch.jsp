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
		<form action="./search" method="post">
			Enter Employee ID : <input type="text" name="empId"><br>
			<br> <input type="submit" value="Search Employee">
		</form>
	</main>

	<%@ include file="footer.jsp"%>


</body>
</html>