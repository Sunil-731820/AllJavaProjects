package com.java.jsf.CollectionsInJava.Set.EnumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumSetExample {
	public static void main(String[] args) {
		System.out.println("This is The Example Of THE Enum Set");
		Set<days> set = EnumSet.of(days.TUESDAY,days.WEDNESDAY);
		System.out.println("the Set Of The Days is ");
		System.out.println(set);
		
		Iterator<days> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		if you want to print all days 
		
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("the All Days Of The weak is ");
		System.out.println(set1);
		
	}

}
