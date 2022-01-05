package com.sujata.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;
import com.sujata.model.service.UserServiceImpl;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=new User(username,password);
		
		UserService userService=new UserServiceImpl();
		
//		ServletContext application=request.getServletContext();
		session.setAttribute("user", user);
		
		try {
			if(userService.userCheck(user)) {
				response.sendRedirect("./employeemenu.jsp");
			}
			else {
				response.sendRedirect("./");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
