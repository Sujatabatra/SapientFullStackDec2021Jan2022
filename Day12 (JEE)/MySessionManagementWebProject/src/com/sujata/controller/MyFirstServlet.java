package com.sujata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * if the session is already available, pick that session otherwise create the
		 * new session
		 */
		HttpSession session = request.getSession();
		/*
		 * or HttpSession session=request.getSession(true);
		 */
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<h1>First Servlet</h1>");
		pw.println("Session ID : " + session.getId() + "<br><br>");
		pw.println("Session Creation Time : " + session.getCreationTime() + "<br><br>");
		pw.println("Session Max Inactive Time Interval : " + session.getMaxInactiveInterval() + "<br><br>");
		pw.println("Is Session New : " + session.isNew() + "<br><br>");
		pw.println("<a href=\"./second\">Go To Second Servlet</a>");

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
