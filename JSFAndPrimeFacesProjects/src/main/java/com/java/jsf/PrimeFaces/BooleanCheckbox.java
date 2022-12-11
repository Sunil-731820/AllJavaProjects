package com.java.jsf.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean  
@SessionScoped
public class BooleanCheckbox {  
		private boolean value;  
		public boolean isValue() {  
			return value;  
		}  
	public void setValue(boolean value) {  
		this.value = value;  
	}  
	
	public void addMessage() {  
		String summary = value ? "Checked" : "Unchecked";  
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));  
	}  
}  