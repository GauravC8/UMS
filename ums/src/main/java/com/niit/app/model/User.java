package com.niit.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="user")
public class User implements Serializable{


	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "emailId")
	private String emailId;

	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "studentId", nullable = false, columnDefinition="int default 1")
	private Integer studentId;
	
	@Column(name = "facultyId", nullable = false, columnDefinition="int default 1")
	private Integer facultyId;
	
	/*
	 * @OneToOne 
	 * 
	 */
	private Student student;
	/*
	 * @OneToOne 
	 */
	private Faculty faculty;

	public User() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}



	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	

	public Integer getFacultyId() {
		return facultyId;
	}


	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	

	public Faculty getFaculty() {
		return faculty;
	}


	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", password=" + password + ", role=" + role + ", studentId="
				+ studentId + ", facultyId=" + "" + ", student=" + student + ", faculty=" + faculty + "]";
	}




	
	

	}
