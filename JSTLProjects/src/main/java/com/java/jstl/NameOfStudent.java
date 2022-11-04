package com.java.jstl;

import java.util.ListResourceBundle;

public class NameOfStudent extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		
		// TODO Auto-generated method stub
		return list;
	}
	
	static final Object[][] list = {
			{
				"Names.firstName","Sunil"
			},
			{
				"Names.middleName","Kumar"
				
			},
			{
				"Names.lastName","Gupta"
			}
			
	};
	

}
