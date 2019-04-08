package com.niit.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "facultyFirstName")
	private String facultyFirstName;
	
	@Column(name = "facultyLastName")
	private String facultyLastName;
	
	@Column(name = "facultyContact")
	private int facultyContact;
	
	@Column(name = "facultyGender")
	private String facultyGender;
	
	@Column(name = "facultyMotherName")
	private String facultyMotherName;
	
	@Column(name = "facultyFatherName")
	private String facultyFatherName;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "password")
	private String password;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFacultyLastName() {
		return facultyLastName;
	}
	public void setFacultyLastName(String facultyLastName) {
		this.facultyLastName = facultyLastName;
	}
	public String getFacultyFirstName() {
		return facultyFirstName;
	}
	public void setFacultyFirstName(String facultyFirstName) {
		this.facultyFirstName = facultyFirstName;
	}
	public int getFacultyContact() {
		return facultyContact;
	}
	public void setFacultyContact(int facultyContact) {
		this.facultyContact = facultyContact;
	}
	public String getFacultyGender() {
		return facultyGender;
	}
	public void setFacultyGender(String facultyGender) {
		this.facultyGender = facultyGender;
	}
	public String getFacultyMotherName() {
		return facultyMotherName;
	}
	public void setFacultyMotherName(String facultyMotherName) {
		this.facultyMotherName = facultyMotherName;
	}
	public String getFacultyFatherName() {
		return facultyFatherName;
	}
	public void setFacultyFatherName(String facultyFatherName) {
		this.facultyFatherName = facultyFatherName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
