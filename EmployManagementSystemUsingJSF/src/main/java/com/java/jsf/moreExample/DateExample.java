package com.java.jsf.moreExample;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "dateExample")
@SessionScoped
public class DateExample {
	
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public String display() {
		return "date";
	}
	

}
