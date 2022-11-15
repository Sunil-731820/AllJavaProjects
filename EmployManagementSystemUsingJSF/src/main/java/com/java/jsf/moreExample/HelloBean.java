package com.java.jsf.moreExample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="helloBean")
@ApplicationScoped
public class HelloBean {
	
	private String name;
	private String password;
	
	static {
		System.out.println("inside the hello Bean Static Block");
	}
	{
		System.out.println("Inside the hello Bean instances block ");
	}
	
	public HelloBean() {
		System.out.println("Inside the hello Bean COnstructor");
	}
	
	
	@PostConstruct
	public void myInit() {
		System.out.println("Inside the Hello Bean @Post Contrsuctor ");
	}
	
	@PreDestroy
	public void myClear() {
		System.out.println("Inside the hello Bean @PreDestroy");
	}
	
	public String checkUser() {
		String str = null;
		if(name.equalsIgnoreCase("Sunil") && password.equalsIgnoreCase("Sunil123")) {
			str = "success";
			return str;
		}else {
			str = "failure";
			return str;
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
