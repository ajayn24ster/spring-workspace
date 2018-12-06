package com.org.ajkart.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBSessionUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}

	public Session getSession() {
		return DBSessionUtil.getSessionFactory().openSession();
	}
}
