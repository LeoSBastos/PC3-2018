package br.com.prog3.aula14.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.com.prog3.aula14.model.Multa;
import br.com.prog3.aula14.model.Veiculo;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration configuration = new Configuration().configure();
			configuration.addPackage("br.com.prog3.aula14.model");
			configuration.addAnnotatedClass(Veiculo.class);
			configuration.addAnnotatedClass(Multa.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}
	
}
