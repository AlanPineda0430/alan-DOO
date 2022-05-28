package co.edu.uco.businesslogic.business;

import java.util.List;

import co.edu.uco.grades.dto.SubjectDTO;

public interface SubjectBusines {
	void create (SubjectDTO subject); 
	void update (SubjectDTO subject);
	void delete (int id);
	List <SubjectDTO> find(SubjectDTO subject);
}
