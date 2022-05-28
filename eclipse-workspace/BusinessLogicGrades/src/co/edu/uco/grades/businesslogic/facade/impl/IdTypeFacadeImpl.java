package co.edu.uco.grades.businesslogic.facade.impl;

import java.util.List;

import co.edu.uco.grades.businesslogicgrades.business.IdTypeBusiness;
import co.edu.uco.businesslogic.business.IdTypeBusines;
import co.edu.uco.grade.businesslogic.business.impl.CourseBusinessImpl;
import co.edu.uco.grades.businesslogic.facade.IdTypeFacade;
import co.edu.uco.grades.businesslogicgrades.business.IdTypeBusiness.impl;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;

public class IdTypeFacadeImpl implements IdTypeFacade {
	
	private DAOFactory daoFactory = DAOFactory.getDaoFactory();

	@Override
	public void create(IdTypeDTO dto) throws Exception {

		try {

			daoFactory.initTransaction();
			IdTypeBusines idTypeBussiness = new CourseBusinessImpl(daoFactory);
			idTypeBussiness.create(dto);

			daoFactory.commitTransaction();

		} catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to create de new IdType on create method ind IdTypeFacadeImpl ";
			throw GradesException.buildTechnicalBusinessLogicException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

	@Override
	public void update(IdTypeDTO dto) throws Exception {

		try {

			daoFactory.initTransaction();
			// Ejecutar el negocio
			IdTypeBusiness idTypeBussiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBussiness.update(dto);

			daoFactory.commitTransaction();

		} catch (GradesException execption) {
			daoFactory.rollbackTransaction();
			throw execption;
		} catch (Exception exeption) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to uptade the IdType on update method ind IdTypeFacadeImpl ";
			throw GradesException.buildTechnicalBusinessLogicException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

	@Override
	public void delete(int id) throws Exception {

		try {

			daoFactory.initTransaction();
			// Ejecutar el negocio
			IdTypeBusiness idTypeBussiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBussiness.delete(id);

			daoFactory.commitTransaction();

		} catch (GradesException execption) {
			daoFactory.rollbackTransaction();
			throw execption;
		} catch (Exception exeption) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to delete IdType on delete method ind IdTypeFacadeImpl ";
			throw GradesException.buildTechnicalBusinessLogicException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto) throws Exception {

		try {

			IdTypeBusiness idTypeBussiness = new IdTypeBusinessImpl(daoFactory);
			return idTypeBussiness.find(dto);

		} catch (GradesException execption) {
			throw execption;
		} catch (Exception exeption) {
			var message = "There was a problem trying to find the IdType on find method in IdTypeFacadeImpl ";
			throw GradesException.buildTechnicalBusinessLogicException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

}