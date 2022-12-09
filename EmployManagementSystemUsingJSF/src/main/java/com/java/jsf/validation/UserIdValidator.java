package com.java.jsf.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "uidValidator")
public class UserIdValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object obj) throws ValidatorException {
		 String strId = (String) obj;
		
		if(!strId.startsWith("P")) {
			FacesMessage fm = new FacesMessage();
			fm.setDetail("user ID Should Be in String Format");
			fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(fm);
		}
		
		
	}
	
	

}
