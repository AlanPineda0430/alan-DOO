package co.edu.uco.grades.businesslogic.bussiness.facade;

import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;

import java.util.List;

import co.edu.uco.businesslogicgrades.bussiness.IdTypeBusiness;
import co.edu.uco.grades.businesslogic.bussines.IdTypeFacade;
import co.edu.uco.grades.crosscutting.exception.GradesException;

public class IdTypeFacadeImpl implements IdTypeFacade {

	private DAOFactory daoFactory = DAOFactory.getDaoFactory();

	public void create(IdTypeDTO dto) {
		try {

		daoFactory.initTransaction();
		
		//ejecutar el negocio
		
		IdTypeBusiness idTypeBussines = new IdTypeBusiness (daoFactory); 
		IdTypeBusiness.create(dto);
		
		
		daoFactory.commitTransaction();
		} catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
				daoFactory.rollbackTransaction();
				var message = "Th"
				throw GradesException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
	}

	public List<IdTypeDTO>find(IdTypeDTO dto) {
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {

			IdTypeFacadeImpl idTypeBusiness = new IdTypeFacadeImpl(daoFactory);
			return idTypeBusiness.find(dto);
		} catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.rollbackTransaction();
			throw GradesException.buildTechnicalBusinessLogicException(message);
		}finally {
			daoFactory.closeConnection();

		}
	}
}
