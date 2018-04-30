package org.felipe.rain.predictor.connector.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			SessionFactory sessionFactory = new Configuration()
					.configure("org/felipe/rain/predictor/connector/hibernate.cfg.xml").buildSessionFactory();
			return sessionFactory;

		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}

	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown () {
		getSessionFactory().close();
	}

}
