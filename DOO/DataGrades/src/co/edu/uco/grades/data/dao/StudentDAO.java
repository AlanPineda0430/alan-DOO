package co.edu.uco.grades.data.dao;

import co.edu.uco.grades.dto.StudentDTO;

public interface StudentDAO {
	
	void create(StudentDTO student);
	
	void update();
	
	void delete();
	
	void find();

}
