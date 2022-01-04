<%@page import="com.sujata.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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