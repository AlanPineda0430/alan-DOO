package co.edu.uco.grades.dto;

import co.edu.uco.crosscutting.util.text.UtilText;

public class TeacherDTO {
	
	private int id;
	private String idNumber;
	private IdTypeDTO idType;
	private String name;
	private String email;
	
	public TeacherDTO() {
		setEmail(UtilText.EMPTY);
		setId(id);
		setIdNumber(UtilText.EMPTY);
		setIdType(idType);
		setName(UtilText.EMPTY);
		
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private String getIdNumber() {
		return idNumber;
	}

	private void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	private IdTypeDTO getIdType() {
		return idType;
	}

	private void setIdType(IdTypeDTO idType) {
		this.idType = idType;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}
	
	

}
