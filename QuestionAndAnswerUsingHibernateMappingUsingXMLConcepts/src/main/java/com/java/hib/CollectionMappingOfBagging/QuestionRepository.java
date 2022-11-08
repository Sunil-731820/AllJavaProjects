package com.java.hib.CollectionMappingOfBagging;

import java.util.ArrayList;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;

public class QuestionRepository {
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
		ArrayList<String> answerList1 = new ArrayList<String>();
		answerList1.add("Object Oriented Programming language");
        answerList1.add("Structural Query  language");
        answerList1.add("Hybrid Programming language");
        answerList1.add("Monolithic Programming language");
  
        ArrayList<String> answerList2 = new ArrayList<String>();
        answerList2.add("User friendly Object oriented language");
        answerList2.add("Complicated structural language");
        answerList2.add("Functional language");
        answerList2.add("RDBMS");
        
        MultipleChoiceQuestion mcq1 = new MultipleChoiceQuestion();
        mcq1.setQuestionName("SQL Is ");
        mcq1.setChoices(answerList1);
        
        MultipleChoiceQuestion mcq2 = new MultipleChoiceQuestion();
        mcq2.setQuestionName("SQL Lite is ");
        mcq2.setChoices(answerList2);
        
        session.persist(mcq1);
        session.persist(mcq2);
        transaction.commit();
        session.close();
        System.out.println("Success We Have done Bag Mapping ");
	}

}
