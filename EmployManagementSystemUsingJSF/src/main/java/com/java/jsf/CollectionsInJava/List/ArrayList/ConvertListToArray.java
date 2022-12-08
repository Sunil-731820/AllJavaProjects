package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		list.add("StrawBerry");
		System.out.println("The List Of The Fruits is");
		System.out.println(list);
		
		
//		Converting the List To Array
		
		String[] array = list.toArray(new String[list.size()]);
		System.out.println("The Array is ");
		System.out.println(array);
		System.out.println(Arrays.toString(array));
	}
}
