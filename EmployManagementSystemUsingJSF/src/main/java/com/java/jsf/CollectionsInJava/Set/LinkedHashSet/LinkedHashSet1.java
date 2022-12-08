package com.java.jsf.CollectionsInJava.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println("The Linked HashSet is ");
		System.out.println(set);
		
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("Java");
		set1.add("T");
		set1.add("Point");
		set1.add("Ggod");
		set.addAll(set1);
		System.out.println("the Set ois ");
		System.out.println(set);
	}

}
