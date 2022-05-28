package co.edu.uco.grades.businesslogic.bussiness.facade;

import java.util.List;

import co.edu.uco.grades.dto.IdTypeDTO;
import co.edu.uco.grades.dto.SubjectDTO;

public interface IdTypeFacade {
	public interface SubjectBusiness {
		
		void create(IdTypeDTO dto) throws Exception;
		void update(IdTypeDTO dto) throws Exception;
		void delete(int id) throws Exception;
		List<IdTypeDTO> find(IdTypeDTO dto) throws Exception;
	}


}
