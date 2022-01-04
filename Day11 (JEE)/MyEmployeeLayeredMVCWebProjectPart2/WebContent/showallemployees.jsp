<%@page import="com.sujata.bean.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.sujata.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<main>
		

		<table border="1">
			<thead>
				<tr>
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Designation</th>
					<th>Department</th>
					<th>Salary</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.employeeList}" var="employee">
					<tr>
						<td>${employee.empId }</td>
						<td>${employee.empName }</td>
						<td>${employee.designation }</td>
						<td>${employee.department }</td>
						<td>${employee.salary }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br> <br> <a href="./employeemenu.jsp">Go To Main Menu</a>
	</main>

	<%@ include file="footer.jsp"%>

</body>
</html>