package com.java.jsf.Validation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import jakarta.validation.constraints.NotNull;


@ManagedBean
@SessionScoped
public class User11 {

	@NotNull(message = "Name Can not Be Empty")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
