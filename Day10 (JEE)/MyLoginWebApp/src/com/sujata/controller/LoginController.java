package com.sujata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;
import com.sujata.model.service.UserServiceImpl;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter pw=response.getWriter();
	    
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		User user=new User(username, password);
		
		UserService userService=new UserServiceImpl();
		
		pw.println("<HTML>");
		pw.println("<HEAD><TITLE>LOGIN INFO PAGE</TITLE></HEAD>");
		pw.println("<BODY>");
		try {
			if(userService.userCheck(user))
				pw.println("<H1>Login Success</H1>");
			else
				pw.println("<H1>Login Failed</H1>");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		pw.println("</BODY>");
		pw.println("</HTML>");
	}

}
