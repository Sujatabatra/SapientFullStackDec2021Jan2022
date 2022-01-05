package com.sujata.resources;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Path("/employees")
public class EmployeeResource {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployeesResource(){
		try {
			return employeeService.getAllEmployee();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Path("/{eId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeByIDResource(@PathParam("eId") String empId) {
		try {
			return employeeService.getEmployeeById(empId);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Path("/payslips/{eId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EmployeePayslip getEmployeePayslipById(@PathParam("eId") String empId) {
		try {
			return employeeService.generatePayslip(empId);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
