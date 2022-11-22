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
		
	}

}
