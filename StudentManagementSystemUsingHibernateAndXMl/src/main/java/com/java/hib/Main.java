package com.java.hib;

import java.util.List;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
	
	
   public static void main(String[] args) {
	  
//	  Adding One Object To The DB
//	  AllStundetFunctionality.add(10, "Arti", 20);
	   
//	   calling the readAll() method in the Main parts
//	   List<Student> listOfStudent = AllStundetFunctionality.readAll();
//	  if(listOfStudent!=null) {
//		  for(Student student : listOfStudent) {
//			   System.out.println(student);
//		   }
//	  }else {
//		  System.out.println("No Student Data is Found In DB");
//	  }
//	  
////	  Calling delete() 
//	  AllStundetFunctionality.delete(10);
//	  List<Student> listOfStudent1 = AllStundetFunctionality.readAll();
//	  if(listOfStudent1!=null) {
//		  for(Student student : listOfStudent1) {
//			   System.out.println(student);
//		   }
//	  }else {
//		  System.out.println("No Student Data is Found In DB");
//	  }
	   
//	   I am calling the update()
	   
	   AllStundetFunctionality.update(2, "Sunil", 23);
}
        

}
