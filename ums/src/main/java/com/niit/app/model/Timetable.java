package com.niit.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "timetable")
	public class Timetable {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;

		@Column(name = "studentCourseEnroll")
		private String studentCourseEnroll;
		@Column(name = "day")
		private String day;

		@Column(name = "slot")
		private String slot;

		@Column(name = "subject")
		private String subject;
		
		@Column(name = "roomno")
		private String roomno;
		
		private String role;

		@Override
		public String toString() {
			return "timetable [id=" + id + ", studentCourseEnroll=" + studentCourseEnroll + ", day=" + day + ", slot="
					+ slot + ", subject=" + subject + ", roomno=" + roomno + "]";
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

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getSlot() {
			return slot;
		}

		public void setSlot(String slot) {
			this.slot = slot;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getRoomno() {
			return roomno;
		}

		public void setRoomno(String roomno) {
			this.roomno = roomno;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
		
		

}
