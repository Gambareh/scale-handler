package models;

import java.util.List;

import domain.User;

public interface UserData {
	
	User getUser(long id);
	List<User> getAllUsers();
	void save(User user);
	void update(User user);
	void delete(User user);
	
}
