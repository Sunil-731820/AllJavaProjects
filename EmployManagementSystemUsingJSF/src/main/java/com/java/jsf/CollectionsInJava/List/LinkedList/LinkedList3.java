package com.java.jsf.CollectionsInJava.List.LinkedList;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList<String> ll =  new LinkedList<String>();
		ll.add("ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");
		
		System.out.println("the Linked List is ");
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println("After the Removal Of The Element At The Specific Positions");
		System.out.println(ll);
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Hanumat");
		ll.addAll(ll2);
		System.out.println("The Linked List is ");
		System.out.println(ll);
		
//		Removing all the new Element from the List
		
		ll.removeAll(ll2);
		System.out.println("After Removing the new Element from the List is ");
		System.out.println(ll);
		
		System.out.println("After Removing the First Element from the List");
		
		ll.removeFirst();
		System.out.println(ll);
		
		System.out.println("After Removing the Last Element from The List ");
		ll.removeLast();
		System.out.println(ll);
		
		ll.removeFirstOccurrence("Gaurav");
		System.out.println("After Removing the First Occurence Of The Objects is ");
		System.out.println(ll);
		
		System.out.println("After removing the Last occurence of The Object");
		ll.removeLastOccurrence("Harsh");
		System.out.println(ll);
		
		ll.clear();
		System.out.println("After The Use Of The clear()");
		System.out.println(ll);
	}

}
