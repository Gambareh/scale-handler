package models;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import domain.Artical;

public class ArticalDataModel implements ArticalData {
	
	private SessionFactory sessionFactory = HibernateInit.getSessionFactory();
	

	@Override
	public Artical getArtical(long id) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Artical artical = null;
		try {
			 tx = session.beginTransaction();
			 artical= (Artical) session.get(Artical.class, id);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}	
		return artical;
	}

	@Override
	public List<Artical> getAllArtical() {
		Session session = sessionFactory.openSession();	
		List<Artical> list = session.createCriteria(Artical.class).list();
		session.close();
		return  list;	
	}

	@Override
	public void save(Artical artical) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		long tmp = 0L;
		
		try {
			 tx = session.beginTransaction();
			 tmp = (long) session.save(artical);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}	
		
	}

	@Override
	public void update(Artical artikal) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;		
		try {
			 tx = session.beginTransaction();
			 session.update(artikal);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}		
	}

	@Override
	public void delete(Artical artikal) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			 tx = session.beginTransaction();
			 session.delete(artikal);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}	
		
	}
	
}
