package co.edu.uco.grades.dto;

import java.util.Date;

public class SessionDTO {
	
	private int id;
	private SessionDTO course;
	private Date date;
	
	
	
	public SessionDTO() {
		setId (id);
		setCourse (course);
		setDate (date);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private SessionDTO getCourse() {
		return course;
	}
	private void setCourse(SessionDTO course) {
		this.course = course;
	}
	private Date getDate() {
		return date;
	}
	private void setDate(Date date) {
		this.date = date;
	}
	
	

}
