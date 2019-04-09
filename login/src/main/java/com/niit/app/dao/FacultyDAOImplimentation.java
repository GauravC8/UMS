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

import com.niit.app.model.Faculty;

@Repository
public class FacultyDAOImplimentation implements FacultyDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Faculty> getFaculties() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Faculty> cq = cb.createQuery(Faculty.class);
		Root<Faculty> root = cq.from(Faculty.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void deleteFaculty(String emailId) {
		Session session = sessionFactory.getCurrentSession();
		Faculty book = session.byId(Faculty.class).load(emailId);
		session.delete(book);
	}

	@Override
	public void saveFaculty(Faculty faculty) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(faculty);
	}

	@Override
	public Faculty getFaculty(String emailId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Faculty theCustomer = currentSession.get(Faculty.class, emailId);
		return theCustomer;
	}
}