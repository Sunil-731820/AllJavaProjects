package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {
	public static void main(String[] args) {
		System.out.println("This is the Example Of The ArrayList ");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println("the List of The Array is ");
		System.out.println(list);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Banana");
		list2.add("Mango");
		list2.add("Apple");
		list2.add("Grapes");
		System.out.println("The List Of The Array List is ");
		System.out.println(list2);
		
//		Iterating the List of The Array Using Interator
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		Using for Each Loop
		System.out.println("the List of The Fruits Using For Each Loop");
		for(String fruits : list) {
			System.out.println(fruits);
		}
		
//		The get() method returns the element at the specified index, 
		System.out.println("the first ELemenet is ");
		System.out.println(list.get(1));
		
//		the set() method changes the element.
		
		System.out.println("Set the Different Values");
		System.out.println(list.set(1,"Jelly"));
		System.out.println("the list After CHanging the Element into the Array is ");
		System.out.println(list);
		
/** 
 * The java.util package provides a utility class Collections,
 *  which has the static method sort(). Using the Collections.sort()
 *   method, we can easily sort the ArrayList.	
 */
		
		Collections.sort(list2);
		System.out.println("after sorting the List is ");
		System.out.println(list2);
	}
	
	
	
	
	

}
