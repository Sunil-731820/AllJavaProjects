package com.java.jstl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionHelper {
	
	public static SessionFactory geSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
