package com.java.jsf.CollectionsInJava.Set.ConcurrentSkipListSet;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetLastExample1 {
	public static void main(String[] args) {
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();
		set.add(78);
		set.add(64);
		set.add(12);
		set.add(45);
		set.add(8);
		System.out.println("The ConcurrentSkipListSet is :");
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
