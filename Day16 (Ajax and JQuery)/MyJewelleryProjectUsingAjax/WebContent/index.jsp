<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SFCC Jewellery Store Made By Sujata Batra</title>
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

	function getData(fileName) {
		var xhr = createXHR();
		if(xhr){
			
			xhr.open("GET",fileName);

			//on every ready state change this function will get called
			xhr.onreadystatechange=function(){
					if(xhr.readyState==4 && xhr.status==200){
						document.getElementById("details").innerHTML=xhr.responseText;
						}
						
				}

			xhr.send(null);
			}
	}
</script>
</head>
<body>
	<h1>Welcome to SFCC Jewellery Store</h1>

	<img src="Bangles.jpeg" onmousemove="getData('bangles.txt')">
	<img src="earrings.jpeg" onmousemove="getData('earrings.txt')">
	<img src="necklace.jpeg" onmousemove="getData('necklace.txt')">
	<br>
	<br>
	<div id="details"></div>

</body>
</html>