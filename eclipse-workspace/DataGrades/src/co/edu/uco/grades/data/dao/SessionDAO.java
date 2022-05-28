package co.edu.uco.grades.data.dao;

import co.edu.uco.grades.dto.SessionDTO;

public interface SessionDAO {
	
	void  create (SessionDTO session) throws Exception;
	void update (SessionDTO session);
	void delete (int id);
	void find (SessionDTO session);

}
