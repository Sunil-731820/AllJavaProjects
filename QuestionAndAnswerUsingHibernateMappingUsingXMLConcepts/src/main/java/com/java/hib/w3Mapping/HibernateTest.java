package com.java.hib.w3Mapping;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateTest {
	
	public static void main(String args[]){
		TreeMap map = new TreeMap();
		map.put("MCA1",new Subject("Data Structure"));
		map.put("MCA2",new Subject("DBMS"));
		map.put("MCA3",new Subject("Java"));
 
		//Create the student object.
		Student student = new Student( "Kapil", "Chawla", 
				"MCA final", "MCA/07/59", 27);
		student.setSubjects(map);
 
		StudentDBOperations obj = new StudentDBOperations();
		//insert student object.
		obj.addStudent(student);
 
		//show all student object.
		obj.showAllStudentDetails();
 
	}
}

class StudentDBOperations {
	/**
	 * This method is used to insert a new student record.
	 * @param student
	 * @return studentId
	 * @author w3spoint
	 */
	public Integer addStudent(Student student){
	    Transaction tx = null;
	    Integer studentId = null;
	    //Get the session object.
	    Session session = 
                    HibernateUtil.getSessionFactory().openSession();
	    try{
	         tx = session.beginTransaction();
	         studentId = (Integer) session.save(student); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if(tx!=null){
	        	 tx.rollback();
	         }
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return studentId;	
	}
 
	/**
	 * This method is used retrieve and show the records.
	 * @author w3spoint
	 */
	public void showAllStudentDetails(){
	    Transaction tx = null;
	    //Get the session object.
	    Session session = 
                    HibernateUtil.getSessionFactory().openSession();
	    try{
	         tx = session.beginTransaction();
	         List<Student> students = 
                         session.createQuery("FROM Student").list();
	         for(Student student : students){
	        	 System.out.println("First Name: " 
                                          + student.getFirstName()); 
	        	 System.out.println("Last Name: " 
                                           + student.getLastName()); 
	        	 System.out.println("Class: " 
                                          + student.getClassName()); 
	        	 System.out.println("RollNo: " 
                                             + student.getRollNo()); 
	        	 System.out.println("Age: " 
                                               + student.getAge()); 
	        	 Map subject = student.getSubjects();
	        	 System.out.println("Subject Name:" + 
	        	        ((Subject)subject.get("MCA1"))
                                                 .getSubjectName());
	        	 System.out.println("Subject Name:" + 
	        	         ((Subject)subject.get("MCA2"))
                                                 .getSubjectName());
	        	 System.out.println("Subject Name:" + 
	        		 ((Subject)subject.get("MCA3"))
                                                 .getSubjectName());
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if(tx!=null){
	        	 tx.rollback();
	         }
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}
}