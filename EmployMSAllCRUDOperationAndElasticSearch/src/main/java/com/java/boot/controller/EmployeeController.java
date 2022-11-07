package com.java.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.boot.entity.Employee;
import com.java.boot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(name = "/showEmployee")
	public List<Employee> viewHomePage(Model model) {
		return employeeService.getAllEmploy();
	}
	
	
}
