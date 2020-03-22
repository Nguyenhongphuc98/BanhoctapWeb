package com.banhoctap.dal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DataAccessLayer {

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session getSession() {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			session = sessionFactory.openSession();
		}
		
		return session;
	}
}
