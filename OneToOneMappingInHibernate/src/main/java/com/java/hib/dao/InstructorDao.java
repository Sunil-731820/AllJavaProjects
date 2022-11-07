package com.java.hib.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.hib.HibernateUtil.HibernateUtil;
import com.java.hib.entity.Instructor;

public class InstructorDao {
	public void saveInstructor(Instructor instructor) {
        Transaction transaction = null;
        try  {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(instructor);
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
