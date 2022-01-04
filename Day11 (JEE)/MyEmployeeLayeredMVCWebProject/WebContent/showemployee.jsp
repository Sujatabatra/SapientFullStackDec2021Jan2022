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
		<%
		Employee employee = (Employee) request.getAttribute("employee");
		%>
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
					<td><%=employee.getEmpId()%></td>
					<td><%=employee.getEmpName()%></td>
					<td>
						<%
						out.println(employee.getDesignation());
						%>
					</td>
					<td>
						<%
						out.println(employee.getDepartment());
						%>
					</td>
					<td>
						<%
						out.println(employee.getSalary());
						%>
					</td>
				</tr>
			</tbody>
		</table>
		<br> <br> <a href="./employeemenu.jsp">Go To Main Menu</a>
	</main>
	<footer>
		<h4>This demo is the registered trade mark of Sujata Batra&reg;</h4>
		<h5>Created for Batch SFCC</h5>
	</footer>
</body>
</html>