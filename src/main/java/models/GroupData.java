package models;

import java.util.List;

import domain.Artical;
import domain.Groups;

public interface GroupData {
	Groups getGroups(long id);
	List<Groups> getAllGroups();
	void save(Groups group);
	void update(Groups group);
	void delete(Groups group);
}
