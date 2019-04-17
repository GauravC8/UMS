package com.niit.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "assignments")
public class Assignment {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "studentCourseEnroll")
	private int studentCourseEnroll;

	@Column(name = "assignment")
	private  byte[]  assignment;
	
	
	//@Cascade({CascadeType.SAVE_UPDATE})
	@OneToOne
	@JoinColumn(name="studentId")
	private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getStudentCourseEnroll() {
		return studentCourseEnroll;
	}

	public void setStudentCourseEnroll(int studentCourseEnroll) {
		this.studentCourseEnroll = studentCourseEnroll;
	}

	public byte[] getAssignment() {
		return assignment;
	}

	public void setAssignment(byte[] assignment) {
		this.assignment = assignment;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
