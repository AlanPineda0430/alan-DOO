package co.edu.uco.grade.businesslogic.business.impl;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.businesslogic.business.CourseBusines;
import co.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.CourseDTO;

public class CourseBusinessImpl implements CourseBusines{
	private DAOFactory daoFactory;
	
	public CourseBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalException("It's not possible create a CourseBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(CourseDTO dto) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(CourseDTO dto) {
		// TODO Auto-generated method stub
		
	}


}
