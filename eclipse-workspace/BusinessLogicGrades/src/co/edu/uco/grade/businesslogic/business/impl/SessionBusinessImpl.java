package co.edu.uco.grade.businesslogic.business.impl;



import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.SessionDTO;
import co.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.businesslogic.business.Sessionbusines;

public class SessionBusinessImpl implements Sessionbusines {
	private DAOFactory daoFactory;
	
	public SessionBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(SessionDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SessionDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(SessionDTO session) {
		// TODO Auto-generated method stub
		
	}


}
