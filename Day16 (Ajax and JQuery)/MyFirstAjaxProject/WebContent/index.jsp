<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function createXHR() {
		var request = false;
		try {
			request = new ActiveXObject('Msxml2.XMLHTTP');
		} catch (err2) {
			try {
				request = new ActiveXObject('Microsoft.XMLHTTP');
			} catch (err3) {
				try {
					request = new XMLHttpRequest();
				} catch (err1) {
					request = false;
				}
			}
		}
		return request;
	}
	function showAllEmps() {
		var xhr = createXHR();
		xhr
				.open(
						"GET",
						"http://localhost:8085/MyEmployeeRestApiProject/webapi/employees",
						true);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && this.status == 200) {
				var responseJsonObj = JSON.parse(this.responseText);

				document.getElementById("allEmps").innerHTML = displayAllEmployees(responseJsonObj);
			}
		};
		xhr.send(null);
	}

	function showEmps() {
		var xhr = createXHR();
		var eId=document.getElementById("empId").value;
		xhr
				.open(
						"GET",
						"http://localhost:8085/MyEmployeeRestApiProject/webapi/employees/"+eId,
						true);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && this.status == 200) {
				var responseJsonObj = JSON.parse(this.responseText);
				document.getElementById("allEmps").innerHTML = displayEmployee(responseJsonObj);
			}
		};
		xhr.send(null);
	}

	function displayAllEmployees(data) {
		var table = "<table border=\"1\"><tr><td>Employee ID</td><td>Employee Name</td><td>Designation</td><td>Department</td><td>Salary</td></tr>";
		for (var index = 0; index < data.empList.length; index++) {
			table += "<tr><td>" + data.empList[index].empId + "</td><td>"
					+ data.empList[index].empName + "</td><td>"
					+ data.empList[index].designation + "</td><td>"
					+ data.empList[index].department + "</td><td>"
					+ data.empList[index].salary + "</td></tr>";
		}
		table+="</table>";
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
	function inputEmpId(){
		document.getElementById("allEmps").innerHTML='<input type="text" id="empId"> <button onclick="showEmps()">Display</button>';
	}
</script>
</head>
<body>
	<a href="javascript:showAllEmps()">Display All Employees</a> &nbsp;&nbsp;&nbsp;&nbsp;
	<a href="javascript:inputEmpId()">Display Employee By ID</a> &nbsp;&nbsp;&nbsp;&nbsp;
	<br><br>
	
	<div id="allEmps"></div>
</body>
</html>