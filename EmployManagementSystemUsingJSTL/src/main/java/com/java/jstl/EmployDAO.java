package com.java.jstl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDAO {
	
//	Read All The Data From The Database 
	
	public static List<Employ> showAllEmploy(){
		SessionFactory sf = SessionHelper.geSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from Employ");
		List<Employ> listOfEmploy = q.list();
		return listOfEmploy;
	}
	
//	Searching the Employ from By Using EmpId
	
	public static Employ searchEmployById(int empId) {
		SessionFactory sf = SessionHelper.geSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from Employ where empId ="+ empId);
		List<Employ> listOfEmploy = q.list();
		Employ employ = null;
		if(listOfEmploy.size()==1) {
			employ = listOfEmploy.get(0);
		}
		 return employ;
		
	}
	
	
	
	public static String addEmpoy(Employ employ) {
		SessionFactory sf = SessionHelper.geSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employ);
		transaction.commit();
		session.close();
		return "Employ Added SucessFully";
	}

}
