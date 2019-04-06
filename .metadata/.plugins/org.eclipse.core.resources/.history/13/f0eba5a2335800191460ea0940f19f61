package com.niit.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emailId")
	private String emailId;

	@Column(name = "studentLastName")
	private String studentLastName;

	@Column(name = "studentFirstName")
	private String studentFirstName;

	@Column(name = "studentContact")
	private int studentContact;

	@Column(name = "studentGender")
	private String studentGender;

	@Column(name = "studentMotherName")
	private String studentMotherName;

	@Column(name = "studentFatherName")
	private String studentFatherName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "password")
	private String password;
	/*
	 * private String street; private String city; private String state; private
	 * String country; private int pincode;
	 * 
	 * private String enrolledCourse; private List<String> qualification;
	 */

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public int getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(int studentContact) {
		this.studentContact = studentContact;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
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
	

	@Override
	public String toString() {
		return "Student [emailId=" + emailId + ", studentLastName=" + studentLastName + ", studentFirstName="
				+ studentFirstName + ", studentContact=" + studentContact + ", studentGender=" + studentGender
				+ ", studentMotherName=" + studentMotherName + ", studentFatherName=" + studentFatherName + ", dob="
				+ dob + ", password=" + password + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
