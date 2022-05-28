package co.edu.uco.grade.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.businesslogic.business.IdTypeBusines;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;
import co.uco.grades.crosscuting.exception.GradesException;

public class IdTypeBusinessImpl implements IdTypeBusines{
	
		
		private DAOFactory daoFactory;
		
		public IdTypeBusinessImpl(DAOFactory daoFactory) {
			
			if(UtilObject.getUtilObject().isNull(daoFactory)) {
				throw GradesException.buildTechnicalException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
			}
			this.daoFactory	= daoFactory;
			 
		}


		@Override
		public void create(IdTypeDTO dto) {
			validateIdTypeDoesNotExistWithSameName(dto);
			
			daoFactory.getIdTypeDAO().create(dto);
			
		}

		private void validateIdTypeDoesNotExistWithSameName(IdTypeDTO dto) {
			IdTypeDTO dtoValidator = new IdTypeDTO();
			dtoValidator.setName(dto.getName());
			
			List<IdTypeDTO> list = daoFactory.getIdTypeDAO().find(dtoValidator);
			if(!list.isEmpty()) {
				var message = "An Id Type with  the same name alredy  exist";
				throw GradesException.buildUserException(message);
				//Generate BussinessEcxeption
			}
		}
		@Override
		public void update(IdTypeDTO dto) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<IdTypeDTO> find(IdTypeDTO dto) {
			// TODO Auto-generated method stub
			return null;
		}

	
}
