package co.edu.uco.grade.businesslogic.business.impl;

import co.edu.uco.businesslogic.business.TeacherBusines;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.TeacherDTO;
import co.uco.grades.crosscuting.exception.GradesException;

public class TeacherBusinessImpl implements TeacherBusines {
	private DAOFactory daoFactory;
	
	public TeacherBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalException("It's not possible create a TeachertBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(TeacherDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TeacherDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(TeacherDTO dto) {
		// TODO Auto-generated method stub
		
	}
}
