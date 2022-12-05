package com.java.jsf.WithDependency;

import java.time.LocalDateTime;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DateBean {
	
	private Date todate;

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	@Override
	public String toString() {
		return "DateBean [todate=" + todate + "]";
	}
	
	public LocalDateTime getDateAndTime() {
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println(dateAndTime);
		return dateAndTime;
	}

}
