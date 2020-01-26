package com.Students.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student_details {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@NotEmpty
	@Column(name="student_Name")
	private String student_name;
	
	@NotEmpty
	@Column(name="student_Surname")
	private String student_surname;
	
	@NotEmpty
	@Column(name="roll_No")
	private String roll_no;
	
	@NotEmpty
	@Column(name="Subject")
	private String subject;
	
	@NotEmpty
	@Column(name="student_Id")
	private String student_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_surname() {
		return student_surname;
	}
	public void setStudent_surname(String student_surname) {
		this.student_surname = student_surname;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	
	
	
}
