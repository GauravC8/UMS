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

import com.niit.app.model.Result;




@Repository
public class ResultDAOImpl implements  ResultDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List< Result> getResults() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery< Result> cq = cb.createQuery( Result.class);
		Root< Result> root = cq.from( Result.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void deleteResult(int id) {
		Session session = sessionFactory.getCurrentSession();
		Result book = session.byId(Result.class).load(id);
		session.delete(book);
	}

	@Override
	public Result saveResult( Result theResult) {
		System.out.println("saveResult::"+theResult);
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theResult);
		return  theResult;
	}

	@Override
	public Result getResult(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Result theResult = currentSession.get(Result.class, theId);
		return theResult;
	}

}
