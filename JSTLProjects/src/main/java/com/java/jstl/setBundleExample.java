package com.java.jstl;

import java.util.ListResourceBundle;

public class setBundleExample extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		return listOfvegetable;
	}
	
	static final Object[][] listOfvegetable = {
										
			{
				"Vegetable.Potato" ,"Potato"
			},
			{
				"Vegetable.Tomato" ,"Tomato"
			},
			{
				"Vegetable.Carrot","Carrot"
			}
	};
	
	public static void main(String[] args) {
		System.out.println(listOfvegetable.toString());
	}
	
	

}
