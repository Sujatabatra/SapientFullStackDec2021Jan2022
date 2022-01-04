<%@page import="com.sujata.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<header>
	<h1>Employee Management System</h1>
	
	<h2>Welcome, ${fn:toUpperCase(applicationScope.user.username)} !</h2>
</header>