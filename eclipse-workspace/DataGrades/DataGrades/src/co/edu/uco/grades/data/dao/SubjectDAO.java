package co.edu.uco.grades.data.dao;

import java.sql.SQLException;
import java.util.List;

import co.edu.uco.grades.dto.SubjectDTO;

public interface SubjectDAO {
	
	void create (SubjectDTO subject) throws Exception; 
	void update (SubjectDTO subject);
	void delete (int id);
	List <SubjectDTO> find(SubjectDTO subject) throws SQLException;

}
