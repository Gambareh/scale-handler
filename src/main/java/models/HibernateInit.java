	package models;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateInit {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml"); 
			ServiceRegistry registry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			
			SessionFactory sf = cfg.buildSessionFactory(registry);
		  return sf;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void close() {
		getSessionFactory().close();
	}
}
