package com.sujata.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;


public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
		
		String empId=request.getParameter("empId");
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		String message=null;
		try {
			if(employeeService.deleteEmployee(empId)) {
				message="Employee Deleted Succesfully";
			}
			else {
				message="Employee Deletion Failed";
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
			
		session.setAttribute("message", message);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("./output.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
