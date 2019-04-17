package com.niit.app.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.app.model.Assignment;

@Repository
public class AssignmentDAOImpl implements AssignmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	@Override
	@Transactional
	public void saveAssignements(Assignment assign) {
		Session currentSession = sessionFactory.getCurrentSession();
	
		System.out.println("save assignments::::"+assign);
		currentSession.saveOrUpdate(assign);
		
	}

	
}