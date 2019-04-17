package com.niit.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "result")
	public class Result{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;

		@Column(name = "studentCourseEnroll")
		private String studentCourseEnroll;
		@Column(name = "studentName")
		private String studentName;

		@Column(name = "cgpa")
		private double cgpa;
		
		private String role;

		@Override
		public String toString() {
			return "Result [id=" + id + ", studentCourseEnroll=" + studentCourseEnroll + ", studentName=" + studentName
					+ ", cgpa=" + cgpa + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getStudentCourseEnroll() {
			return studentCourseEnroll;
		}

		public void setStudentCourseEnroll(String studentCourseEnroll) {
			this.studentCourseEnroll = studentCourseEnroll;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public double getCgpa() {
			return cgpa;
		}

		public void setCgpa(double cgpa) {
			this.cgpa = cgpa;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
		
		

	}