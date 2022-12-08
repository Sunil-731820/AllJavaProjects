package com.java.jsf.CollectionsInJava.Set.HashSet;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("Initial Set is ");
		System.out.println(set);
		
		set.remove("Ravi");
		System.out.println("After removing the Set is ");
		System.out.println(set);
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set1.add("Sunil");
		set.addAll(set1);
		System.out.println("the Combined Set is ");
		System.out.println(set);
	}

}
