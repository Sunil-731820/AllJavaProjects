package com.java.hib.MappingSetInXML;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ShowAllSetDataMain {
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
//		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Question");
		List listOfQuestions = query.list();
		Iterator<Question> itr = listOfQuestions.iterator();
		int counter  = 0;
		while(itr.hasNext()) {
			Question q = itr.next();
			System.out.println("--------------------------------------------------------");
			System.out.println("Question Name is :  "+q.getQuestionName());
			Set<String> listOfAnswer = q.getChoices();
			Iterator itr1 = listOfAnswer.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			counter++;
		}
		System.out.println("the Counter is "+ counter);
		
	}

}
