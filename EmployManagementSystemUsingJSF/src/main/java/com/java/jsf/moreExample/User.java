package com.java.jsf.moreExample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class User {
	
	private String strUserName;
	private String strPassword;
	
	
	
	
	public String getStrUserName() {
		return strUserName;
	}




	public void setStrUserName(String strUserName) {
		this.strUserName = strUserName;
	}




	public String getStrPassword() {
		return strPassword;
	}




	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}




	public String checkUser() {
		if(strUserName.equalsIgnoreCase("Sunil") && strPassword.equals("sunil")) {
			return "success";
		}else {
			System.out.println("Fail ");
			return "failure";
		}
	}
	

}
