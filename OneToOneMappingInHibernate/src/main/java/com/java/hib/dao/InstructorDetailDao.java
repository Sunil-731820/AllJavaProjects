package com.java.hib.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.hib.HibernateUtil.HibernateUtil;
import com.java.hib.entity.InstructorDetail;

public class InstructorDetailDao {
	
	 public void saveInstructorDetail(InstructorDetail instructorDetail) {
	        Transaction transaction = null;
	        try  {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(instructorDetail);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

}
