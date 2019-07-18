package models;

import java.util.List;

import domain.Artical;

public interface ArticalData {
	Artical getArtical(long id);
	List<Artical> getAllArtical();
	void save(Artical artical);
	void update(Artical artical);
	void delete(Artical artikal);
}
