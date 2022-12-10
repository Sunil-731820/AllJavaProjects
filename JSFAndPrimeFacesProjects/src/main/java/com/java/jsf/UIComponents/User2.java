package com.java.jsf.UIComponents;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@ManagedBean
@SessionScoped
public class User2 {
	
	@NotNull(message = "user Name can not Be Empty")
	private String name;
	
	@NotNull(message = "Mobile Number Can Not be EMpty")
	@Size(min = 10,max = 10,message = "Mobile Number Must Have 10 Digits")
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
