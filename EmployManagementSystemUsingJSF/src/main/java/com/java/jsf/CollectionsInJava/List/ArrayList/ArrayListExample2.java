package com.java.jsf.CollectionsInJava.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample2 {
	public static void main(String[] args) {
		/**Ways to iterate the elements of the collection in Java
		There are various ways to traverse the collection elements:

		By Iterator interface.
		By for-each loop.
		By ListIterator interface.
		By for loop.
		By forEach() method.
		By forEachRemaining() method.
		 * 
		 */
		
//		by Using List Iterator Interface
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		System.out.println("Traversing the List Using  List Iterator ");
		System.out.println(list);
		
		System.out.println("In Reverse Directions");
		ListIterator<String> list1 = list.listIterator(list.size());
		while(list1.hasPrevious()) {
			System.out.println(list1.previous());
		}
		
		System.out.println("In Forward Directions");
		
		ListIterator<String> list2 = list.listIterator();
		while(list2.hasNext()) {
			System.out.println(list2.next());
		}
		
//		Use Of For Each Remaining Loop
		System.out.println("after the Use Of The for Each Remaining Loop");
		Iterator<String> itr =  list.iterator();
		itr.forEachRemaining(name->
		
				{
					System.out.println(name);
				}
				);
		
		
	}

}
