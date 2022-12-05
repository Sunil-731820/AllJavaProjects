package com.java.jsf.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "nameValidator")
public class UserNameValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object obj) throws ValidatorException {
		String name = (String) obj;	
		if(!name.startsWith("S")) {
			FacesMessage fm = new FacesMessage();
			fm.setDetail("Name Should Start With S only");
			fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(fm);
		}
		
	}
	

}
