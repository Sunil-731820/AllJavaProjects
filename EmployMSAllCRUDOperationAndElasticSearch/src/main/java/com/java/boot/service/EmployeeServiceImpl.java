package com.java.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.boot.entity.Employee;
import com.java.boot.entity.repository.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmploy() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(int emp_Id) {
		
		Optional<Employee> optional = employeeRepository.findById(emp_Id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}
		else {
			throw new RuntimeException("Employee Not Found for Id :::"+ emp_Id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeByid(int emp_Id) {
		this.employeeRepository.deleteById(emp_Id);
		
	}

	@Override
	public List<Employee> searchDatabyAnyWords() {
		List<Employee> getListOfEmployee = getAllEmploy();
		getListOfEmployee.stream().filter(name ->name.getEmp_firstName().startsWith("S"));
		return getListOfEmployee;
		
	}

	@Override
	public void updateEmploy(Employee employee, Integer emp_Id) {
		employeeRepository.save(employee);
		
	}
	

}
