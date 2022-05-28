package co.edu.uco.grade.businesslogic.business.impl;

import co.edu.uco.businesslogic.business.StudentBusines;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.dto.StudentDTO;
public class StudentBusinessImpl implements StudentBusines{
	private DAOFactory daoFactory;
	
	public StudentBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalException("It's not possible create a StudenttBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(StudentDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(StudentDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(StudentDTO student) {
		// TODO Auto-generated method stub
		
	}
}
