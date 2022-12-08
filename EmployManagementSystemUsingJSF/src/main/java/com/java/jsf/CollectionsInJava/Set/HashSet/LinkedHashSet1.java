package com.java.jsf.CollectionsInJava.Set.HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println("The Linked HashSet is ");
		System.out.println(set);
	}

}
