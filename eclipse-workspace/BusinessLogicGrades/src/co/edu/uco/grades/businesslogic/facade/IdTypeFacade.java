package co.edu.uco.grades.businesslogic.facade;

import java.util.List;

import co.edu.uco.grades.dto.IdTypeDTO;

public interface IdTypeFacade {
	void create(IdTypeDTO dto) throws Exception;
	void update(IdTypeDTO dto) throws Exception;
	void delete(int id) throws Exception;
	List<IdTypeDTO> find(IdTypeDTO dto) throws Exception;

}
