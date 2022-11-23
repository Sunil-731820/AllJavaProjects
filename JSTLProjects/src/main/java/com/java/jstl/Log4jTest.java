package com.java.jstl;

import org.apache.logging.log4j.core.config.Loggers;
import org.glassfish.hk2.utilities.reflection.Logger;

public class Log4jTest {
	
	private static Logger log = Logger.getLogger();
	public static void main(String[] args) {
		System.out.println("The Use Of the Log4j In eclipse for debuggiing ");
		
		
		
		log.debug("Log4J Debug Message Test");
		System.out.println("After Calling the Log.Debug()");
		log.debug("Log4j info Message Tesst");
		log.warning("Hello Warning ");
		
		String number = Integer.toString(1);
		System.out.println("The Number is ");
		System.out.println(number);
		System.out.println("The Type Of The String is ");
		System.out.println(number.charAt(0));
		System.out.println(number.getClass().getName());
		
		String name = "Hello My name Is Sunil";
		System.out.println("The String is ");
		if(name.startsWith("My")) {
			System.out.println("String found ");
		}else {
			System.out.println("String not found ");
		}
		if(name.equals("1")) {
			System.out.println("Found ");
		}else {
			System.out.println("Not Found");
		}
		if(name=="Hello My name Is Sunil") {
			System.out.println("Same String");
		}else {
			System.out.println("Different String ");
		}
	}

}
