package com.java.jstl;

import java.util.ListResourceBundle;

public class Simple1 extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		return listOfContents;
	}
	
	static final Object[][] listOfContents = {
			{
				"Color.red","red"
			},
			{
				"Color.green","green"
			},
			{
				"Color.yellow","yellow"
			}
	};
	public static void main(String[] args) {
		System.out.println(listOfContents.toString());
	}

}
