package models;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import domain.Artical;
import domain.Users;

public class UserDataModel implements UserData{
	
	private SessionFactory sessionFactory = HibernateInit.getSessionFactory();

	@Override
	public Users getUser(long id) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Users users = null;
		try {
			 tx = session.beginTransaction();
			 users= (Users) session.get(Users.class, id);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}	
		return users;
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Users user) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			 tx = session.beginTransaction();
			  session.save(user);
			 tx.commit();
		} catch (Exception e) {
				if(tx!=null){
					tx.rollback();
				}
		}finally {session.close();}	
		
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Users user) {
		// TODO Auto-generated method stub
		
	}

	
}
