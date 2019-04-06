package com.niit.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "emailId", unique = true, columnDefinition = "VARCHAR(64)")
	private String emailId;

	@Column(name = "studentFirstName")
	private String studentFirstName;

	@Column(name = "studentLastName")
	private String studentLastName;

	@Column(name = "studentContact")
	private String studentContact;

	@Column(name = "studentGender")
	private String studentGender;

	@Column(name = "studentMotherName")
	private String studentMotherName;

	@Column(name = "studentFatherName")
	private String studentFatherName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "studentCourseEnroll")
	private String studentCourseEnroll;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private String pincode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "country")
	private String country;

	@Column(name = "password")
	private String password;

	public String getStudentCourseEnroll() {
		return studentCourseEnroll;
	}

	public void setStudentCourseEnroll(String studentCourseEnroll) {
		this.studentCourseEnroll = studentCourseEnroll;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
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

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [emailId=" + emailId + ", studentLastName=" + studentLastName + ", studentContact="
				+ studentContact + ", studentGender=" + studentGender + ", studentMotherName=" + studentMotherName
				+ ", studentFatherName=" + studentFatherName + ", dob=" + dob + ", studentCourseEnroll="
				+ studentCourseEnroll + ", address=" + address + ", city=" + city + ", pincode=" + pincode
				+ ", country=" + country + ", password=" + password + "]";
	}

}
