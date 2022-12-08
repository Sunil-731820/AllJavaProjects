package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.util.ArrayList;

public class ArrayList8 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Anuj");
		al.add("Ajay");
		al.add("Gaurav");
		System.out.println("the List Of The Array is ");
		System.out.println(al);
		
		al.remove(0);
		System.out.println("After removing the List Of The ELement From THe Array is ");
		System.out.println(al);
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("HanuMat");
		al.addAll(al2);
		System.out.println("Updated List");
		System.out.println(al);
		
//		Remove the Element on the Basis Of Sprcief Conditions
		
		al.removeIf(
				str -> str.contains("Ajay")
				);
		System.out.println("After Removing the Specific Element");
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}
