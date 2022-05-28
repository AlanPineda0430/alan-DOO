package co.edu.uco.businesslogic.business;

import co.edu.uco.grades.dto.TeacherDTO;

public interface TeacherBusines {
	void create(TeacherDTO dto);
	void update (TeacherDTO dto);
	void delete (int id);
	void find (TeacherDTO dto);
}
