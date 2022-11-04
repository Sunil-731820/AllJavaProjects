package com.java.jstl;

import java.util.ListResourceBundle;

public class Simple extends ListResourceBundle{
	 static final Object[][] contents = { 
			 								{ "colour.Violet", "Violet"},  
			 								{ "colour.Indigo", "Indigo" }, 
			 								{ "colour.Blue", "Blue" }, 
			 								{"colour.red","red"}
	         							}; 

	public Object[][] getContents() {  
        return contents;  
    }  
   
 
}
