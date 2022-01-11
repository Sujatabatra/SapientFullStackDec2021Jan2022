package com.sujata.resources;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.bean.Employees;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Path("/employees")
public class EmployeeResource {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Employee> getAllEmployeesResource(){
//		try {
//			return employeeService.getAllEmployee();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployeesResource(){
		
		Employees employees=new Employees();
		try {
			List<Employee> empList=employeeService.getAllEmployee();
			employees.setEmpList(empList);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return Response
	            .status(200)
	            .header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	            .header("Access-Control-Max-Age", "1209600")
	            .entity(employees)
	            .build();
	}
	
	
//	@Path("/{eId}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Employee getEmployeeByIDResource(@PathParam("eId") String empId) {
//		try {
//			return employeeService.getEmployeeById(empId);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	
	@Path("/{eId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeByIDResource(@PathParam("eId") String empId) {
		Employee employee=null;
		try {
			employee=employeeService.getEmployeeById(empId);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return Response
	            .status(200)
	            .header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	            .header("Access-Control-Max-Age", "1209600")
	            .entity(employee)
	            .build();
	}
	
	
	@Path("/payslips/{eId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeePayslipById(@PathParam("eId") String empId) {
		EmployeePayslip empPaySlip=null;
		try {
			empPaySlip=employeeService.generatePayslip(empId);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return Response
	            .status(200)
	            .header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	            .header("Access-Control-Max-Age", "1209600")
	            .entity(empPaySlip)
	            .build();
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertEmployeeResource(Employee employee) {
		Employee emp=null;
		try {
			emp= employeeService.insertEmployee(employee);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return Response
	            .status(200)
	            .header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	            .header("Access-Control-Max-Age", "1209600")
	            .entity(emp)
	            .build();
	}
}
