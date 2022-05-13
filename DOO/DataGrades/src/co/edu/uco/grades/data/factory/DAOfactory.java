package co.edu.uco.grades.data.factory;

import co.edu.uco.grades.data.dao.StudentDAO;

public class DAOfactory {
	
	public static DAOfactory getDAOfactory() {
		return null;
	}
	
	protected abstract void OpenConnection();
	
	public abstract void getConnection();
	
	public abstract void closeConnection();
	
	public abstract void commit();
	
	public abstract void rollback();
	
	public abstract StudentDAO getStudentDAO();
}
