package co.edu.uco.grades.businesslogic.bussiness.facade;

import java.util.List;

import co.edu.uco.grades.dto.SubjectDTO;

public interface IdTypeFacade {
	public interface SubjectBusiness {
		
		void create(SubjectDTO dto);
		void update(SubjectDTO dto);
		void delete(int id);
		List<SubjectDTO> find(SubjectDTO dto);

	}


}
