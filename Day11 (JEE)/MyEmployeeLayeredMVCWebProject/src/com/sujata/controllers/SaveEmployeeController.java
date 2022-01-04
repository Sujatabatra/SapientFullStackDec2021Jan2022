package com.sujata.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.bean.Employee;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;


public class SaveEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId=request.getParameter("empId");
		String empName=request.getParameter("empName");
		String empDesig=request.getParameter("empDesig");
		String empDeptt=request.getParameter("empDeptt");
		int empSal=Integer.parseInt(request.getParameter("empSalary"));
		
		Employee employee=new Employee(empId, empName, empDesig, empDeptt, empSal);
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		String message=null;
		try {
			if(employeeService.insertEmployee(employee)) {
				message="Employee Added Successfully";
			}
			else {
				message="Employee Addition Failed";
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("message", message);
		RequestDispatcher dispatcher=request.getRequestDispatcher("./output.jsp");
		dispatcher.forward(request, response);
			
	}

}
