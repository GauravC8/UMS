package com.niit.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.app.dao.StudentDAO;
import com.niit.app.model.Student;

@Service
public class StudentServiceImplimentation implements StudentService {
	@Autowired
	private StudentDAO studentDAO;

	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}

	@Override
	@Transactional
	public Student getStudent(String emailId) {
		return studentDAO.getStudent(emailId);
	}

	@Override
	@Transactional
	public void deleteStudent(String emailId) {
		studentDAO.deleteStudent(emailId);
	}
}
