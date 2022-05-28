package co.edu.uco.businesslogic.business;

import co.edu.uco.grades.dto.CourseDTO;

public interface CourseBusines {
	void create (CourseDTO dto);
	void delete (int id);
	void find (CourseDTO dto);
}
