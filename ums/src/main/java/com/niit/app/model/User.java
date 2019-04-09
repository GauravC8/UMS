
package com.niit.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class User {

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private User user;
	
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
