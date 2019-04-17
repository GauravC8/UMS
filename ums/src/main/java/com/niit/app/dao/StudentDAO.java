package com.niit.app.dao;

import java.util.List;

import com.niit.app.model.Assignment;
import com.niit.app.model.Student;

public interface StudentDAO {

	public List<Student> getStudents();
	public Student getStudent(String emailId);
	public Student showStudent(int studentId);
	public void deleteStudent(int id);
	public void saveStudent(Student student);
	public void saveAssignements(Assignment assign);
}