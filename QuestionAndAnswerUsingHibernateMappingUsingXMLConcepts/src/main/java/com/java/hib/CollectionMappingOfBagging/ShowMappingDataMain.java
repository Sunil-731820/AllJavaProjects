package com.java.hib.CollectionMappingOfBagging;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ShowMappingDataMain {
	
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
		Query query =  session.createQuery("from MultipleChoiceQuestion");
		List<MultipleChoiceQuestion> listOfQuestions = query.list();
		Iterator<MultipleChoiceQuestion> itr = listOfQuestions.iterator();
		while(itr.hasNext()) {
			MultipleChoiceQuestion q = itr.next();
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Question Name is "+ q.getQuestionName());
			List<String> listOfAnswer = q.getChoices();
			Iterator<String> itr2 = listOfAnswer.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			
		}
		
		
		
	}

}
