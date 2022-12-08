package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.util.ArrayList;

public class ArrayList7 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("After adding the Element of the Array");
		System.out.println(al);
		
		al.add(1, "Sunil");
		System.out.println("after adding the One Element into the Array List ");
		System.out.println(al);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Sonoo");
		list2.add("Hanumat");
		
		al.addAll(list2);
		System.out.println("After Adding The List is ");
		System.out.println(al);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("John");
		list3.add("Rahul");
		al.addAll(1, list3);
		System.out.println("The List Is ");
		System.out.println(al);
	}

}
