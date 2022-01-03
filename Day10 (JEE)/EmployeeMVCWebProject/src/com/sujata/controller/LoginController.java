package com.sujata.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		User user=new User(username, password);
		UserService userService=new UserServiceImpl();
		
		ServletContext application=request.getServletContext();
		application.setAttribute("username", username);
		try {
			if(userService.userCheck(user)) {
				response.sendRedirect("./menu.jsp");
			}
			else {
				response.sendRedirect("./userlogin.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
