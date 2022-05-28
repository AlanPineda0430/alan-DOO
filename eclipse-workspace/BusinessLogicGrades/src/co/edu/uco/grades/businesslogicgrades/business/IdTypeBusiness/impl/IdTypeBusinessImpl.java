package co.edu.uco.grades.businesslogicgrades.business.IdTypeBusiness.impl;

import java.util.List;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.businesslogicgrades.business.IdTypeBusiness;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;

	
	public class IdTypeBusinessImpl implements IdTypeBusiness {
		
		private DAOFactory daoFactory;
		
		public IdTypeBusinessImpl() throws Exception {
			if(UtilObject.getUtilObject().isNull(daoFactory)) {
				throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a SubjectBusinessImpl when DAOFactory is null");
			}
			
		}

		public IdTypeBusinessImpl(DAOFactory daoFactory2) {
			
		}

		@Override
		public void create(IdTypeDTO dto) {
			// TODO Auto-generated method stub
			
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