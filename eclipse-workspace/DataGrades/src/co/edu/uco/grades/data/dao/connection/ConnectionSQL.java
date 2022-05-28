package co.edu.uco.grades.data.dao.connection;

import java.sql.Connection;

import co.edu.uco.crosscutting.exception.GeneralException;
import co.edu.uco.crosscutting.util.sql.UtilConnection;
import co.edu.uco.grades.crosscutting.exception.GradesException;

public class ConnectionSQL {
	
	private Connection connection;
	
	protected ConnectionSQL(Connection connection) throws Exception {
		if(UtilConnection.isClosed(connection)) {
			throw GeneralException.buildTechnicalDataException(
					"It's not possible to create the specific DAO because the connection is closed");
		}
		
		setConnection(connection);
		
	}

	protected Connection getConnection() {
		return connection;
	}

	private void setConnection(Connection connection) {
		this.connection = connection;
	}
	

}
