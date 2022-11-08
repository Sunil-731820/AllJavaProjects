package com.java.hib;

import java.util.List;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AllStundetFunctionality {
	
//	Create the SessionFactory when you start the Application
	
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
	
//	1 : I have to Read All Data From the STudent Table 
	
	public static List<Student> readAll(){
		List<Student> students = null;
//		Create The Session 
		Session session = SESSION_FACTORY.openSession();
//		Create the Transaction Here 
		Transaction transaction = null;
		try {
//			Begin the Transaction 
			transaction = session.beginTransaction();
			students = session.createQuery("FROM Student").list();
			transaction.commit();
	
		} catch (HibernateException e) {
//		if There is an Exception Roll Back the Changes
			if(transaction!=null) {
				transaction.rollback();
			}
//			Print the Exception
			e.printStackTrace();
		}finally {
//			close the Sesion
			session.close();
		}
		
		return students;
	}
	
//	2 : I Have to Add The Student data to DB
	
	public static void add(int id , String name,int age) {
//		Create One Session
		
		Session session = SESSION_FACTORY.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setAge(age);
//			Saving the Student
			session.save(student);
//			Commit the Student
			transaction.commit();
		} catch (HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}
	
//	3 : Delete The Existing Student
	
	public static void delete(int id) {
//		Create the Sesison
		Session session = SESSION_FACTORY.openSession();
//		Create Transaction 
		Transaction transaction = null;
		try {
//			Begin Transaction
			transaction = session.beginTransaction();
//			Get The Student From The Data Base 
			Student student = (Student) session.get(Student.class, Integer.valueOf(id));
//			Delete the Student from The DB
			session.delete(student);
//			COmmit The Transaction 
			transaction.commit();
		} catch (HibernateException e) {
//			If There is An Exception roll back The changes
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
//	4 : Updating the Data Of Student In DB
	
	public static void update(int id , String name ,int age) {
//		Create The Sesion 
		Session session = SESSION_FACTORY.openSession();
//		Create Transaction 
		Transaction transaction = null;
		try {
//			Begin The Transaction
			transaction = session.beginTransaction();
//			Get The Student From The DB
			Student student = (Student) session.get(Student.class,Integer.valueOf(id));
//			change the Values
			student.setName(name);
			student.setAge(age);
//			Update The Data Using Update()
			session.update(student);
//			commit the Session
			transaction.commit();
		} catch (HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

}
