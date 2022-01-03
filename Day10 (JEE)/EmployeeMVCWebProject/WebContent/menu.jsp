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
		<h2>Welcome <%String username=(String)application.getAttribute("username");
		out.println(username);%></h2>
	</header>
	<nav>
		<a href="">List All Employees</a><br><br>
		<a href="">Search Employee By ID</a><br><br>
		<a href="">Delete Employee</a><br><br>
		<a href="">Update Employee</a><br><br>
		<a href="">Generate Payslip</a><br><br>
	</nav>
	<footer>
		<h5>Copyright content of batch SFCC &copy;</h5>
		<h6>Registered trademark of Sujata Batra &reg;</h6>
	</footer>
</body>
</html>