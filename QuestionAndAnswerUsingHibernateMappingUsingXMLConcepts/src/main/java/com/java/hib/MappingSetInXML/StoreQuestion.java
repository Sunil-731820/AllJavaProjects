package com.java.hib.MappingSetInXML;

import java.util.HashSet;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class StoreQuestion {
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
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Java is a Programming Language");
		set1.add("Java is a platform");
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Servelet is an Interface");
		set2.add("Servelet is an API");
		
		Question q1 = new Question();
		q1.setQuestionName("What is Java");
		q1.setChoices(set1);
		
		
		Question q2 = new Question();
		q2.setQuestionName("What is Servelet");
		q2.setChoices(set2);
		
		session.persist(q1);
		session.persist(q2);
		transaction.commit();
		session.close();
		System.out.println("Added The Questions in the DB");
		
	}

}
