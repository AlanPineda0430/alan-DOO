package co.edu.uco.crosscutting.exception;

import static co.edu.uco.crosscutting.util.text.UtilText.*;

import co.edu.uco.crosscutting.util.text.UtilText;

import static co.edu.uco.crosscutting.util.object.UtilObject.getUtilObject;

public class GeneralException  extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -349723082969698830L;
	
	private String userMessage;
	private String technicalMessage;
	private Exception rootException;
	
	
	
	protected GeneralException(String userMessage, String technicalMessage, Exception rootException) {
		super();
		this.userMessage = userMessage;
		this.technicalMessage = technicalMessage;
		this.rootException = rootException;
	}
	
	public static GeneralException build(String technicalMessage) {
		return new GeneralException(null, technicalMessage, null);
	}
	
	public static GeneralException build(String technicalMessage,
			Exception rootException) {
		return new GeneralException(null, technicalMessage, rootException);
	}
	private String getUserMessage() {
		return userMessage;
	}
	private void setUserMessage(String userMessage) {
		this.userMessage = trim(userMessage);
	}
	private String getTechnicalMessage() {
		return technicalMessage;
	}
	private void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = trim(technicalMessage);
	}
	private Exception getRootException() {
		return rootException;
	}
	private void setRootException(Exception rootException) {
		this.rootException = getUtilObject().getDefault(rootException);
	}
	
	
}
