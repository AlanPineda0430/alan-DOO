package co.edu.uco.grade.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grade.businesslogic.business.SubjectBusiness;
import co.edu.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.SubjectDTO;

public class SubjectBusinessImpl implements SubjectBusiness {
	
	private DAOFactory daoFactory;
	
	public SubjectBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(SubjectDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SubjectDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubjectDTO> find(SubjectDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
