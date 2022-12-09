package com.java.jsf.CollectionsInJava.Set.TreeSet;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		System.out.println("this is the Example OfThe tree Set is ");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Ravi");
		ts.add("Vijay");
		ts.add("Ravi");
		ts.add("Ajay");
		ts.add("ajay");
		System.out.println("The Tree Set is ");
		System.out.println(ts);
	}

}
