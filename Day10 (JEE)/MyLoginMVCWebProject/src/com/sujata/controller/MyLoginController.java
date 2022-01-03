package com.sujata.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;
import com.sujata.model.service.UserServiceImpl;


public class MyLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		User user=new User(username, password);
		UserService userService=new UserServiceImpl();
		String message=null;
		try {
			if(userService.userCheck(user)) {
				/*url not changed
				 * one request response cycle
				 */
				RequestDispatcher dispatcher=request.getRequestDispatcher("./success.jsp");
				dispatcher.forward(request, response);
			}
			else {
				/*url getting changed
				 * two request response cycle
				 */
				response.sendRedirect("./failure.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
