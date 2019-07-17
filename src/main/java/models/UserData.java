package models;

import java.util.List;

import domain.Users;

public interface UserData {
	
	Users getUser(long id);
	List<Users> getAllUsers();
	void save(Users user);
	void update(Users user);
	void delete(Users user);
	
}
