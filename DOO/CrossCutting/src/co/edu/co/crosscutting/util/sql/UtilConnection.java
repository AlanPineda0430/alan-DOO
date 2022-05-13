package co.edu.co.crosscutting.util.sql;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.crosscutting.exception.GeneralException;
import co.edu.uco.crosscutting.util.object.UtilObject;

public class UtilConnection {
	
	private UtilConnection() {
	}
	
	public static boolean isClosed(Connection connection) {
	
		if(UtilObject.getUtilObject().isNull(connection)) {
			throw GeneralException.build("This connection is null");
		}
		
		try {
			return connection.isClosed();
		} catch (SQLException exception) {
			throw GeneralException.build("Problems trying to validate if connection was closed!",
					exception);
		}
	}
}
