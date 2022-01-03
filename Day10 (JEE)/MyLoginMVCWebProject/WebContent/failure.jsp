<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red">Sorry,
<% String name=request.getParameter("uname");
out.print(name); %>
,Login Failed!</h1>

<a href="./">Go To Login Page</a>
</body>
</html>