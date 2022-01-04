package com.sujata.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.bean.Employee;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;


public class GetAllEmployeesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService employeeService=new EmployeeServiceImpl();
		List<Employee> employeeList=null;
		try {
			
			employeeList=employeeService.getAllEmployee();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("employeeList", employeeList);
		RequestDispatcher dispatcher=request.getRequestDispatcher("./showallemployees.jsp");
		dispatcher.forward(request, response);
		
	}



}
