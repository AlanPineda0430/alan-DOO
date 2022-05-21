package co.edu.uco.grades.dto;

import co.edu.uco.crosscutting.util.text.UtilText;

public class SubjectDTO {
	
	private int id;
	private String name;
	
	
	public SubjectDTO() {
		setId (id);
		setName (UtilText.EMPTY);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
