package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.edu.uco.crosscutting.exception.GeneralException;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.dao.CourseDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.CourseDTO;
	
	public class CourseAzureSqlDAO extends ConnectionSQL implements CourseDAO {

		private CourseAzureSqlDAO(Connection connection) throws Exception {
			super(connection);
		}
		
		public static CourseDAO build(Connection connection) throws Exception {
			return new CourseAzureSqlDAO(connection);
		}

		@Override
		public void create(CourseDTO course) throws Exception {
			String sql = "INSERT INTO Course(subject, professor, initialDate, finalDate) VALUES(?,?,?,?)";
			
			try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
				preparedStatement.setInt(1, course.getId());
			}catch (SQLException exception){
				
				throw GeneralException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server");
				
			}catch (Exception exception) {
				
				throw GeneralException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
				
			}
			
		}


		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void find(CourseDTO course) {
			// TODO Auto-generated method stub
			
		}


}
