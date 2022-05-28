package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.edu.uco.crosscutting.exception.GeneralException;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.dao.SessionDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.SessionDTO;

	
	public class SessionAzureSqlDAO extends ConnectionSQL implements SessionDAO {

		private SessionAzureSqlDAO(Connection connection) throws Exception {
			super(connection);
		}
		
		public static SessionDAO build(Connection connection) throws Exception {
			return new SessionAzureSqlDAO(connection);
		}

		@Override
		public void create(SessionDTO session) throws Exception {
			String sql = "INSERT INTO Session(course, date) VALUES(?,?)";
			
			try {
				try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
					preparedStatement.setInt(1, session.getId());
				}catch (SQLException exception){
					
					throw GeneralException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server", exception);
					
				}catch (Exception exception) {
					
					throw GeneralException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		@Override
		public void update(SessionDTO session) {
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
