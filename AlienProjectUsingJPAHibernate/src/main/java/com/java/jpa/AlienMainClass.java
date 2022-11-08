package com.java.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlienMainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Alien a1 = new Alien();
		a1.setAid(1);
		a1.setAname("Sunil");
		a1.setTech("CSE");
		
		em.getTransaction().begin();
		em.persist(a1);
		em.getTransaction().commit();
		
	}

}
