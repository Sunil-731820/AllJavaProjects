package com.java.boot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.boot.entity.Employee;
import com.java.boot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
//	Getting All Data from the DB
	@GetMapping("/showEmployee")
	public List<Employee> showAllEmployee() {
		return employeeService.getAllEmploy();
	}
	
//	Searching Any Data StartWith
	@RequestMapping("/searchTheWordStartWithS")
	public List<Employee> searchAnyData(){
		return employeeService.searchDatabyAnyWords();
	}
	
//	Getting the EMployee Data By Employ Id
	@RequestMapping("/student/{emp_Id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer emp_Id){
		try {
			Employee employee = employeeService.getEmployeeById(emp_Id);
			return new ResponseEntity<Employee>(employee,HttpStatus.OK);	
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		
	}
	
//	Inserting the Data to The DB
	@PostMapping("/employ")
	private Integer saveEmploy(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return employee.getEmp_Id();
	}
	
	
	
//	Deleting the Employ from the DB by Id
	
	@RequestMapping("/delete/{emp_Id}")
	private void deleteEmploy(@PathVariable Integer emp_Id) {
		employeeService.deleteEmployeeByid(emp_Id);
	}
	
	
//	Updating the Data of Employee
	@GetMapping("/updateEmploy")
	private Employee updateEmploy(@RequestBody Employee employee) {
		employeeService.updateEmploy(employee, 1);
		return employee;
	}
}
