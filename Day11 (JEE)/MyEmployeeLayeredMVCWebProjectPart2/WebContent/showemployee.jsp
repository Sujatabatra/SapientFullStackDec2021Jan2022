<%@page import="com.sujata.bean.Employee"%>
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

	<main>
		
		<table border="1">
			<thead>
				<tr>
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Employee Designation</th>
					<th>Employee Department</th>
					<th>Employee Salary</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${requestScope.employee.empId }</td>
					<td>${requestScope.employee.empName }</td>
					<td>${requestScope.employee.designation }</td>
					<td>${requestScope.employee["department"] }</td>
					<td>${requestScope.employee.salary }</td>
				</tr>
			</tbody>
		</table>
		<br> <br> <a href="./employeemenu.jsp">Go To Main Menu</a>
	</main>

	<%@ include file="footer.jsp"%>
</body>
</html>