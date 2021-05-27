package com.hcl.employees.services;

import java.util.List;

import com.hcl.EmployeesDAO.EmployeeDAO;
import com.hcl.employees.beans.Employee;
import com.hcl.employees.util.UserInputException;

public class EmployeeServices {
	EmployeeDAO ed=new EmployeeDAO();
	public  List<Employee> displayEmployee(){
		return ed.displayEmployee();
	}

	public  Employee addEmployee(Employee employee) throws UserInputException {
		// TODO Auto-generated method stub
		return ed.addEmployee(employee);
	}
	public  void updateEmployee(Employee employee) throws UserInputException{
		 ed.updateEmployee(employee);
	}
	public  void deleteEmployee(int emp_id) throws UserInputException {
		ed.deleteEmployee(emp_id);
		
	}
	public  List<Employee> searchEmployee(int emp_id) throws UserInputException{
		return ed.searchEmployee(emp_id);
	}

}
