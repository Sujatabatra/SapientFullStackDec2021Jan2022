<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
		$("#link1").click(function(){
			$.getJSON("http://localhost:8085/MyEmployeeRestApiProject/webapi/employees",function(data1,status){
				$("#allEmps").html(displayAllEmployees(data1))}
			)}
		)}

		
)
$(document).ready(function(){
	$("#link2").click(function(){
			alert("hello");
			$.getJSON("http://localhost:8085/MyEmployeeRestApiProject/webapi/employees/999",function(data2,status){
				$("#allEmps").html(displayEmployee(data2))}
			)}
		)}
	)


	function displayAllEmployees(data) {
		var table = "<table border=\"1\"><tr><td>Employee ID</td><td>Employee Name</td><td>Designation</td><td>Department</td><td>Salary</td></tr>";
		for (var index = 0; index < data.empList.length; index++) {
			table += "<tr><td>" + data.empList[index].empId + "</td><td>"
					+ data.empList[index].empName + "</td><td>"
					+ data.empList[index].designation + "</td><td>"
					+ data.empList[index].department + "</td><td>"
					+ data.empList[index].salary + "</td></tr>";
		}
		return table;
	}

	function displayEmployee(data) {
		var table = "<table border=\"1\"><tr><td>Employee ID</td><td>Employee Name</td><td>Designation</td><td>Department</td><td>Salary</td></tr>";
		table += "<tr><td>" + data.empId + "</td><td>"
				+ data.empName + "</td><td>"
				+ data.designation + "</td><td>"
				+ data.department + "</td><td>"
				+ data.salary + "</td></tr></table>";

		return table;
	}
</script>
</head>
<body>
	<a id="link1" href="#">Display All Employees</a>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<a id="link2" href="#">Display Employee By ID</a>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<br>
	<br>
	<div id="allEmps"></div>
</body>
</html>