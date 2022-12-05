package com.java.jsf.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
public class CommandButton {
	
	public void commandButtonAction(ActionEvent actionEvent) {
		for(int i=0;i<10;i++) {
			addMessage("You have clicked that Button"+ " "+ i);
		}
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,summary,null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
