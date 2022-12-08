package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	public static void main(String[] args) {
		
		String[] array = {
				"Java","Python","PHP","C++"
		};
		System.out.println("the Array is ");
		System.out.println(array);
		System.out.println("The Array is ");
		System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		for(String lang : array) {
			list.add(lang);
		}
		
		System.out.println("the List is ");
		System.out.println(list);
	}

}
