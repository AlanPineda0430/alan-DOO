package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.edu.uco.crosscutting.exception.GeneralException;
import co.edu.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.dao.TeacherDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.TeacherDTO;

	public class TeacherAzureSqlDAO extends ConnectionSQL implements TeacherDAO {

		private TeacherAzureSqlDAO(Connection connection) {
			super(connection);
		}
		
		public static TeacherDAO build(Connection connection) {
			return new TeacherAzureSqlDAO(connection);
		}

		@Override
		public void create(TeacherDTO professor) {
			String sql = "INSERT INTO Teacher(idNumber, idType, name, email) VALUES(?,?,?,?)";
			
			try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
				preparedStatement.setString(1, professor.getIdNumber());
				preparedStatement.setInt(2, professor.getIdType().getId());
			}catch (SQLException exception){
				
				throw GradesException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server", exception);
				
			}catch (Exception exception) {
				
				throw GradesException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
				
			}
			
		}

		@Override
		public void update(TeacherDTO professor) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void find(TeacherDTO professor) {
			// TODO Auto-generated method stub
			
		}

	}
