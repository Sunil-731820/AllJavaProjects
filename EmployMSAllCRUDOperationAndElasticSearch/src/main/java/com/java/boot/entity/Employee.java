package com.java.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Employee")
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_Id;
	private String emp_firstName;
	private String emp_lastName;
	private String emp_BussinessUnit;
	
	

}
