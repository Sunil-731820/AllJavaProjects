package com.java.jsf.CollectionsInJava.Set.HashSet;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("two");
		set.add("Three");
		set.add("Four");
		set.add("five");
		set.add("One");
		set.add("two");
		set.add("Three");
		set.add("Four");
		set.add("five");
		System.out.println("The Set is ");
		System.out.println(set);
	}

}
