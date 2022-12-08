package com.java.jsf.CollectionsInJava.List.CopyOnWriteArray;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListToArrayExample1 {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<Integer>(new Integer[] {1,2,3,4,5,6});
		Object[] toArrayList = null;
		
		toArrayList = numbers.toArray();
		Arrays.toString(toArrayList);
		System.out.println("The Array List is ");
		System.out.println(Arrays.toString(toArrayList));
	}

}
