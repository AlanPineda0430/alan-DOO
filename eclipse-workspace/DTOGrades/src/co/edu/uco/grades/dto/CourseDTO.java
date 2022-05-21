package co.edu.uco.grades.dto;

import java.util.Date;

import co.edu.uco.crosscutting.util.text.UtilText;

public class CourseDTO {
	
	private int id;
	private SubjectDTO subject;
	private TeacherDTO professor;
	private Date initialDate;
	private Date finalDate;
	
	
	
	public CourseDTO() {
		setId (id);
		setSubject (subject);
		setProfessor (professor);
		setInitialDate (initialDate);
		setFinalDate (finalDate);
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private SubjectDTO getSubject() {
		return subject;
	}
	private void setSubject(SubjectDTO subject) {
		this.subject = subject;
	}
	private TeacherDTO getProfessor() {
		return professor;
	}
	private void setProfessor(TeacherDTO professor) {
		this.professor = professor;
	}
	private Date getInitialDate() {
		return initialDate;
	}
	private void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	private Date getFinalDate() {
		return finalDate;
	}
	private void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
		
		
}


