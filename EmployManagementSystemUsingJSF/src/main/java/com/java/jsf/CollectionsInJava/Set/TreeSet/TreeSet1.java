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
		
		System.out.println("This is the Example Of The Tree Set ");
		
		TreeSet<Integer> numberSet = new TreeSet<Integer>();
		numberSet.add(1);
		numberSet.add(100);
		numberSet.add(1000);
		numberSet.add(23);
		System.out.println(numberSet);
		
		System.out.println("the Another Use Of The Set is ");
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("the Above Set is ");
		System.out.println(set);
		
		System.out.println("the Set in DesAscending Order is ");
		System.out.println(set.descendingSet());
		System.out.println(set.headSet("C",true));
		
		System.out.println("The Sub Set is ");
		System.out.println(set.subSet("A", false,"E",true));
		
		System.out.println("The Tail Set is ");
		System.out.println(set.tailSet("C",false));
		
		
	}

}
