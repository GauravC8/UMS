package com.niit.app.model;

import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {
	
	@Id
	@Column(name = "emailId", unique = true, columnDefinition = "VARCHAR(64)")
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

	@Column(name = "department")
	private String department;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "role")
	private String role;

	@Column(name = "password")
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFacultyFirstName() {
		return facultyFirstName;
	}

	public void setFacultyFirstName(String facultyFirstName) {
		this.facultyFirstName = facultyFirstName;
	}

	public String getFacultyLastName() {
		return facultyLastName;
	}

	public void setFacultyLastName(String facultyLastName) {
		this.facultyLastName = facultyLastName;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		String encodedString = password;
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(encodedString);
		return (new String(decodedByteArray));
		/* return password; */
	}

	public void setPassword(String password) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = password;
		String encodedString = encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		this.password = encodedString;
		/* this.password = password; */
	}
	
}
