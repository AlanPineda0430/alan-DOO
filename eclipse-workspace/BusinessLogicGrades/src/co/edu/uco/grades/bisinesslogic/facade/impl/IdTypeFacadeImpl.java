package co.edu.uco.grades.bisinesslogic.facade.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.IdTypeBusines;
import co.edu.uco.grade.businesslogic.business.impl.IdTypeBusinessImpl;
import co.edu.uco.grades.businesslogic.facade.IdTypeFacade;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;
import co.uco.grades.crosscuting.exception.GradesException;

public class IdTypeFacadeImpl implements IdTypeFacade {


	
	
	@Override
	public void create(IdTypeDTO dto) {
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
			//Ejecutar el negocio
			IdTypeBusines idTypeBusines = new IdTypeBusinessImpl(daoFactory);
			idTypeBusines.create(dto);
			daoFactory.commitTransaction();
		}catch(GradesException exception) {
			daoFactory.rollbackTransaction();
			//TODO: handle
			throw exception;
		}
		catch(Exception exception) {
			daoFactory.rollbackTransaction();
			//TODO: handle
			var  message  ="There was a problem trying to create the new IdType on create method in IdTypeFacadeImpl";
			throw GradesException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(IdTypeDTO dto) {
		// TODO Auto-generated method stub
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
			//Ejecutar el negocio
			IdTypeBusines idTypeBusines = new IdTypeBusinessImpl(daoFactory);
			idTypeBusines.update(dto);
			
			daoFactory.commitTransaction();
		}catch(GradesException exception) {
			daoFactory.rollbackTransaction();
			//TODO: handle
			throw exception;
		}
		catch(Exception exception) {
			daoFactory.rollbackTransaction();
			//TODO: handle
			var  message ="There was a problem trying to update the new IdType on create method in IdTypeFacadeImpl";
			throw GradesException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
			//Ejecutar el negocio
			IdTypeBusines idTypeBusines = new IdTypeBusinessImpl(daoFactory);
			idTypeBusines.delete(id);
			daoFactory.commitTransaction();
		}catch(GradesException exception) {
			daoFactory.rollbackTransaction();
			//TODO: handle
			throw exception;
		}
		catch(Exception exception) {
			daoFactory.rollbackTransaction();
			//TODO: handle
			var  message ="There was a problem trying to delete the new IdType on create method in IdTypeFacadeImpl";
			throw GradesException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto) {
		// TODO Auto-generated method stub
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			
			//Ejecutar el negocio
			IdTypeBusines idTypeBusines = new IdTypeBusinessImpl(daoFactory);
			return idTypeBusines.find(dto);

		}catch(GradesException exception) {
			
			//TODO: handle
			throw exception;
		}
		catch(Exception exception) {

			//TODO: handle
			var  message ="There was a problem trying to find the new IdType on create method in IdTypeFacadeImpl";
			throw GradesException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
		// TODO Auto-generated method stub
		
	}

}
