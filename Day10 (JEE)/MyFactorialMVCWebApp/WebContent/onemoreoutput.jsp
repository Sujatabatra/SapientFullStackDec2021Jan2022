<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Factorial of 
<%out.print(application.getAttribute("number"));%>
 is 
<% int factorial=(int)application.getAttribute("factorialResult");
out.print(factorial);%>
</h1>
</body>
</html>