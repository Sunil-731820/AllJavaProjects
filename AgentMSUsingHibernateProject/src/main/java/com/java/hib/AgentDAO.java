package com.java.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AgentDAO {
	
	SessionFactory sf;
	Session session;
	
	public Agent searchAgent(int agentId) {
		SessionFactory sf = SessionHelper.getSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from Agent where agentId="+agentId);
		List<Agent> agentList = q.list();
		Agent agent = null;
		if(agentList.size()==1) {
			agent = agentList.get(0);
		}
		return agent;
		
	}
	
	public List<Agent> showAgent(){
		
		SessionFactory sf = SessionHelper.getSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from Agent");
		List<Agent> listOfAgent = q.list();
		return listOfAgent;
	}
	
	public String addAgent(Agent agent) {
		SessionFactory sf = SessionHelper.getSessionFactory();
		Session session= sf.openSession();
		Transaction t = session.beginTransaction();
		session.save(agent);
		t.commit();
		return "Agent Data Is Added SuccessFully";
		
	}
	
	public String updateAgent(Agent agent) {
		SessionFactory sf = SessionHelper.getSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.update(agent);
		t.commit();
		return "Agent Data is Updated Successfully";
	}
	
	public String deleteAgent(int agentId) {
		SessionFactory sf = SessionHelper.getSessionFactory();
		Session session = sf.openSession();
		Agent agent = searchAgent(agentId);
		session.close();
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.delete(agent);
		t.commit();
		return "Agent Deleted Successfully";
	}

}
