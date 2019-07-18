package models;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import domain.Artical;
import domain.Groups;

public class GroupDataModel implements GroupData{
	
	private SessionFactory sessionFactory = HibernateInit.getSessionFactory();

	@Override
	public Groups getGroups(long id) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Groups groups = null;
		try {
			 tx = session.beginTransaction();
			 groups= (Groups) session.get(Groups.class, id);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}	
		return groups;
	}

	@Override
	public List<Groups> getAllGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Groups groups) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			 tx = session.beginTransaction();
			  session.save(groups);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}	
	}

	@Override
	public void update(Groups group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Groups group) {
		// TODO Auto-generated method stub
		
	}
	
}
