package com.java.jsf.moreExample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "fromActionNavigation")
@RequestScoped
public class FromActionNavigationINJSF {
	
	public String  displayTestPage() {
		return "success";
	}
	
	public String displayWelcomePage() {
		return "success";
	}

}
