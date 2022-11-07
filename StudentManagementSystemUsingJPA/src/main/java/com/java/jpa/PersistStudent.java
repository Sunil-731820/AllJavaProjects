package com.java.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        StudentEntity s1=new StudentEntity();  
        s1.setS_id(101);  
        s1.setS_name("Gaurav");  
        s1.setS_age(24);  
        em.persist(s1);
        em.getTransaction().commit();
        emf.close();
        em.close();
        
	}

}
