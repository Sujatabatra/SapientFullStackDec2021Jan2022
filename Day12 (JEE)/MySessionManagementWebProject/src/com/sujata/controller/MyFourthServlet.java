package com.sujata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFourthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * if the session is already there pick that, otherwise don't create the new
		 * session
		 */
		HttpSession session = request.getSession(false);

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		if (session != null) {
			pw.println("<h1>Fourth Servlet</h1>");
			pw.println("Session ID : " + session.getId() + "<br><br>");
			pw.println("Session Creation Time : " + session.getCreationTime() + "<br><br>");
			pw.println("Session Max Inactive Time Interval : " + session.getMaxInactiveInterval() + "<br><br>");
			pw.println("Is Session New : " + session.isNew() + "<br><br>");
		} else {
			pw.println("<a href=\"./first\">Click Here to enter in our application, as yyou logged out in third servlet</a>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
