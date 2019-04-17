package com.niit.timetable.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.timetable.model.Timetable;

@Repository
public class TimetableDAOImpl implements TimetableDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Timetable> getTimetables() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Timetable> cq = cb.createQuery(Timetable.class);
		Root<Timetable> root = cq.from(Timetable.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void deleteTimetable(int id) {
		Session session = sessionFactory.getCurrentSession();
		Timetable book = session.byId(Timetable.class).load(id);
		session.delete(book);
	}

	@Override
	public void saveTimetable(Timetable theTimetable) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theTimetable);
	}

	@Override
	public Timetable getTimetable(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Timetable theTimetable = currentSession.get(Timetable.class, theId);
		return theTimetable;
	}

}
