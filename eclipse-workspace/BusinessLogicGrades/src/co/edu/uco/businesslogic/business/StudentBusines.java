package co.edu.uco.businesslogic.business;

import co.edu.uco.grades.dto.StudentDTO;

public interface StudentBusines {
	void create(StudentDTO student);
	void update(StudentDTO student);
	void delete(int id);
	void find(StudentDTO student);
}
