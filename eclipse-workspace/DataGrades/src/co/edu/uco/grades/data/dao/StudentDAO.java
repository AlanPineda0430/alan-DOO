package co.edu.uco.grades.data.dao;

import co.edu.uco.grades.dto.StudentDTO;
public interface StudentDAO {

	
	void create (studentDTO student);
	
	void update (StudentDTO student);
	
	void delete (int id);
	
	void find(studentDTO student );
	
	
}
