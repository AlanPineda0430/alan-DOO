package co.edu.uco.grades.businesslogic.facade;

import co.edu.uco.grades.dto.CourseDTO;

public interface CourseFacade {
	void create (CourseDTO dto);
	void delete (int id);
	void find (CourseDTO dto);
}
