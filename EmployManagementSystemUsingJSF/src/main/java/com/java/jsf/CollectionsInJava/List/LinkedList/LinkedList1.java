package com.java.jsf.CollectionsInJava.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("the Linked List is ");
		System.out.println(al);
		
		al.addFirst("Lokesh");
		System.out.println("the Linked List is ");
		System.out.println(al);
		
		al.addLast("Harish");
		System.out.println("the Linked List is ");
		System.out.println(al);
	}

}
