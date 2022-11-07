package com.java.boot.service;

import java.util.List;

import com.java.boot.entity.Employee;

public interface EmployeeService {
	
//	getting the List Of The Employ From the Data base
	List<Employee> getAllEmploy();
	
//	saving One Employee To the Data Base
	void saveEmployee(Employee employee);
	
//	Getting the One Employee From the Database By Using Id
	Employee getEmployeeById(int emp_Id);

//	Deleting the Employ By Id
	void deleteEmployeeByid(int emp_Id);
	
	
	

}
