package com.java.hib.MappingListInXML;

import java.util.ArrayList;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class StoreQuestion1 {
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
		 Transaction t=session.beginTransaction();    
	        
		    ArrayList<String> list1=new ArrayList<String>();    
		    list1.add("Linux is Open Source OS");    
		    list1.add("It is Free from virus and it is poweful OS");    
		        
		    ArrayList<String> list2=new ArrayList<String>();    
		    list2.add("API is a application Programming Interface");    
		    list2.add("API is used to communicate with web browser and Server");    
		        
		    Question1 question1=new Question1();    
		    question1.setQuestionName("What is Linux?");    
		    question1.setChoices(list1);    
		        
		    Question1 question2=new Question1();    
		    question2.setQuestionName("What is API?");    
		    question2.setChoices(list2);    
		        
		    session.persist(question1);    
		    session.persist(question2);    
		        
		    t.commit();    
		    session.close();    
		    System.out.println("success"); 
	}

}
