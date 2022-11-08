package com.java.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_Id;
	private String emp_firstName;
	private String emp_lastName;
	private String emp_BussinessUnit;
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_firstName() {
		return emp_firstName;
	}
	public void setEmp_firstName(String emp_firstName) {
		this.emp_firstName = emp_firstName;
	}
	public String getEmp_lastName() {
		return emp_lastName;
	}
	public void setEmp_lastName(String emp_lastName) {
		this.emp_lastName = emp_lastName;
	}
	public String getEmp_BussinessUnit() {
		return emp_BussinessUnit;
	}
	public void setEmp_BussinessUnit(String emp_BussinessUnit) {
		this.emp_BussinessUnit = emp_BussinessUnit;
	}
	
	
	
	

}
