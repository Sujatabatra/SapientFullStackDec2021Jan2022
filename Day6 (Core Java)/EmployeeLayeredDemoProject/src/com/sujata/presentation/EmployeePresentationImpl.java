package com.sujata.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Insert New Employee");
		System.out.println("4. Delete Employee By ID");
		System.out.println("5. Update Employee Salary By ID");
		System.out.println("6. Generate Salary Slip By Employee Id ");
		System.out.println("7. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			try {
				List<Employee> employeeList=employeeService.getAllEmployee();
				for(Employee employee:employeeList) {
					System.out.println(employee);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				System.out.println("Enter Employee ID whoes Record you want to search");
				String employeeId=scanner.next();
				Employee empl=employeeService.getEmployeeById(employeeId);
				if(empl!=null)
					System.out.println(empl);
				else
					System.out.println("Employee with id "+employeeId+" does not exist");
			}
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
			System.out.println("Enter employee ID : ");
			String id = scanner.next();
			System.out.println("Enter Employee Name : ");
			String na = scanner.next();
			System.out.println("Enter Employee Designation : ");
			String desig = scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt = scanner.next();
			System.out.println("Enter Employee Salary : ");
			int sal = scanner.nextInt();
			Employee emp=new Employee(id, na, desig, deptt, sal);
			if(employeeService.insertEmployee(emp))
				System.out.println("Employee Added!");
			else
				System.out.println("Employee Addition Failed!");
			}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println("Employee Addition Failed!");
			}
			break;
		case 4:
			try {
				System.out.println("Enter Employee ID whoes record you want to delete ");
				String emplId=scanner.next();
				if(employeeService.deleteEmployee(emplId))
					System.out.println("Employee Deleted!");
				else
					System.out.println("Employee Deletion Failed");
			}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println("Employee Deletion Failed!");
			}
			break;
		case 5:
			try {
				System.out.println("Enter Employee ID whoes salary you want to update ");
				String empId=scanner.next();
				System.out.println("Enter new Salary : ");
				int salary=scanner.nextInt();
				if(employeeService.updateEmployee(empId,salary))
					System.out.println("Employee Salary Updated!");
				else
					System.out.println("Employee Salary Updation Failed");
			}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println("Employee Updation Failed!");
			}
			break;
		case 6:
			try {
				System.out.println("Enter Employee ID whoes payslip you want to view: ");
				String empId=scanner.next();
				EmployeePayslip payslip=employeeService.generatePayslip(empId);
				if(payslip!=null)
					System.out.println(payslip);
				else
					System.out.println("Employee with id "+empId+" does not exist");
			}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println("Employee with entered id does not exist");
			}
			break;
		case 7:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
