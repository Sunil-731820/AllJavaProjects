package com.java.jsf.BeanValidation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@ManagedBean
@RequestScoped
public class User {
	
	@NotNull(message = "Name can Not Be Empty")
	private String name;
	
	@NotNull(message = "Age Should Be Filled")
	@Min(18)
	private int age;
	
	@NotNull(message = "Mobile Can Not Empty")
	@Size(min = 10,max = 10,message = "Mobile Must Have 10 digits")
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
	
}
