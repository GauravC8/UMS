package com.niit.app.dao;

import com.niit.app.model.Student;
import com.niit.app.model.User;

public interface UserDAO {

	public User checkUser(User theUser);
	
	public Student showStudent(int studentId);
}
