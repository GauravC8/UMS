package com.niit.app.service;

import java.util.List;

import com.niit.app.model.Student;

public interface StudentService {

	public List<Student> getStudents();
	public Student showStudent(int studentId);
	public Student getStudent(String emailId);
	public void deleteStudent(int id);
	public void saveStudent(Student student);
}