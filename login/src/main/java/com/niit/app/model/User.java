
package com.niit.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "student")
public class User {

	@Id
	@Column(name = "emailId")
	private String emailId;

	@Column(name = "password")
	private String password;

	public User() {

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

	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", password=" + password + "]";
	}

}
