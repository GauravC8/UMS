package com.niit.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.app.dao.StudentDAO;
import com.niit.app.model.Student;
import com.niit.app.model.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private com.niit.app.dao.UserDAO UserDAO;
	
	
	@Override
	@Transactional
	public User checkUser(User theUser) {
		User userRturn = UserDAO.checkUser(theUser);
		//Student student = theUser.getStudent();
	//	Student student1 = UserDAO.showStudent(userRturn.getStudentId());
	//	userRturn.setStudent(student1);
		return userRturn;	
	}

}
