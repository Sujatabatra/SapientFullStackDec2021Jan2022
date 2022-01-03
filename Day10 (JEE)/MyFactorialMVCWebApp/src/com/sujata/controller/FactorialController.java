package com.sujata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.model.service.Factorial;

/**
 * Servlet implementation class FactorialController
 */
public class FactorialController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("no"));

		Factorial factorialService = new Factorial(number);

		int factorial = factorialService.getFactorial();

		/*
		 * Servlet have three scopes 
		 * 1. Application Scope : need to set it at ServletContext 
		 * 2. Request Scope : need to set it at HttpServletRequest
		 * 3. Session
		 * Scope
		 * 
		 * if we want to share calculated data among different servlets and jsp's then we
		 * need to set attribute
		 */

//		request.setAttribute("factorialResult", factorial);
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("./output.jsp");
//		dispatcher.forward(request, response);

		ServletContext context=request.getServletContext();
		context.setAttribute("factorialResult", factorial);
		context.setAttribute("number", number);
		response.sendRedirect("./onemoreoutput.jsp");
	}

}
