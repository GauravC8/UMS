package com.niit.app.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.app.model.Student;

@Repository
public class StudentDAOImplimentation implements StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Student> getStudents() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
		Root<Student> root = cq.from(Student.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void deleteStudent(String emailId) {
		Session session = sessionFactory.getCurrentSession();
		Student book = session.byId(Student.class).load(emailId);
		session.delete(book);
	}

	@Override
	public void saveStudent(Student student) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(student);
	}

	@Override
	public Student getStudent(String emailId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student theCustomer = currentSession.get(Student.class, emailId);
		return theCustomer;
	}
}