package com.java.hib.MappinUsingMapInXML;

import java.util.HashMap;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class StoreQuestionForMap {
private static final SessionFactory SESSION_FACTORY;
	
	/**
	 * Initialising the SessionFactory instance
	 */
	static {
//		Create the Configuration Objects 
		Configuration config = new Configuration();
//		Configure Using the Application Resource named hibernate.cfg.xml
		config.configure();
//		Extract The Properties From The Configuration File
		Properties prop = config.getProperties();
		
//		Create StandardServiceRegistryBuilder using the Properties
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(prop);
		
//		Build a ServiceRegistry
		ServiceRegistry resgistry = builder.build();
		SESSION_FACTORY = config.buildSessionFactory(resgistry);
		
	}
	
	public static void main(String[] args) {
		Session session = SESSION_FACTORY.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Java is Programming Language by", "John Milton");
		map1.put("Java is a platform","Ashok Kumar");    
	    
		HashMap<String,String> map2=new HashMap<String,String>();    
		map2.put("Servlet technology is a server side programming","John Milton");    
		map2.put("Servlet is an Interface","Ashok Kumar");    
		map2.put("Servlet is a package","Rahul Kumar");    
		
		QuestionDataForMap q1 = new QuestionDataForMap("What is java ", map1);
		QuestionDataForMap q2 = new QuestionDataForMap("What is Servlet?", map2);
		
		session.persist(q1);
		session.persist(q2);
		transaction.commit();
		session.close();
		
	}

}
