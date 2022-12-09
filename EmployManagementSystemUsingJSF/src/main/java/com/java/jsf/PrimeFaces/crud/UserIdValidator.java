package com.java.jsf.PrimeFaces.crud;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value = "uidValidator")
public class UserIdValidator implements Validator{

	@Override
	 public void validate(FacesContext fc, UIComponent uic, Object obj) throws ValidatorException {

        String strId = (String) obj;

        if (!strId.startsWith("MM-")) {

                FacesMessage fm = new FacesMessage();

                fm.setDetail("UserId should be in the format MM-1234");

                fm.setSeverity(FacesMessage.SEVERITY_ERROR);

                throw new ValidatorException(fm);

        }

}
	
	

}
