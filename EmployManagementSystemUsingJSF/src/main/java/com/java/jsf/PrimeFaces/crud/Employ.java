package com.java.jsf.PrimeFaces.crud;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "employ")
@SessionScoped
public class Employ {
	
	private String firstName;
	private String lastName;
	private int age;
	private String location;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	static EmployDAO dao;
	static {
		dao = new EmployDAO();
	}
	
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		return dao.showEmploy();
	}
	

}
