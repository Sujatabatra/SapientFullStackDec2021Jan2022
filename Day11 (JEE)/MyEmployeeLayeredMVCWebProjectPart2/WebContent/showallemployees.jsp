<%@page import="com.sujata.bean.Employee"%>
<%@page import="java.util.List"%>
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
		<%
		List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
		%>

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
				<%
				for (Employee employee : employeeList) {
				%>
				<tr>
					<td><%=employee.getEmpId() %></td>
					<td><%=employee.getEmpName() %></td>
					<td><%=employee.getDesignation() %></td>
					<td><%=employee.getDepartment() %></td>
					<td><%=employee.getSalary() %></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		<br> <br> <a href="./employeemenu.jsp">Go To Main Menu</a>
	</main>

	<%@ include file="footer.jsp"%>

</body>
</html>