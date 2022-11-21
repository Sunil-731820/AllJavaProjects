package com.java.jstl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Names{
	
	public static List<String> getAllList(){
		List<String> listOfString = new ArrayList<String>();
		listOfString.add("Hello");
		listOfString.add("hello");
		listOfString.add("Praveen");
		listOfString.add("Harish");
		listOfString.add("Sai");
		return listOfString;
	}
}

public class SortTheArrayOfString {
	public static void main(String[] args) {
		List<String> getAllList = Names.getAllList();
		for(String name :getAllList) {
			System.out.println(name);
		}
		System.out.println("------------");
		System.out.println("the USe of The Iterator is ");
		Iterator itr = getAllList.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}
		
		System.out.println("The Use of the Stream is ");
		System.out.println(
				getAllList.stream()
				.collect(Collectors.toList())
				);
		System.out.println("Sorting the String Of The Data is ");
		System.out.println(
				getAllList.stream()
				.sorted()
				.collect(Collectors.toList())
				);
		System.out.println("-------------------------------------");
		List<String> sortedList = getAllList.stream()
				.sorted()
				.collect(Collectors.toList());
		for(String sortedName : sortedList) {
			System.out.println(sortedName);
		}
	}

}
