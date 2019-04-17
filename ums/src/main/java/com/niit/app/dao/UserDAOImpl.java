package com.niit.app.dao;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.app.model.Student;
import com.niit.app.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
		
	@Override
	public User checkUser(User theUser) {
		User usr=null;
		Session session=null;
		try {
			System.out.println("check user theUser::"+theUser);
		 session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.select(root).where(cb.and(
				cb.equal(root.get("emailId"), theUser.getEmailId())),	
				cb.equal(root.get("password"),theUser.getPassword())
			);
		System.out.println("check user cq::"+cq);
		Query<User> query = session.createQuery(cq);
		query.setMaxResults(1);
		usr=(User) query.getSingleResult();
		System.out.println("check user before returning::"+usr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				//session.close();
			}
		}
		
		return usr;
	}
	
	
	@Override
	public Student showStudent(int studentId) {
		System.out.println("showStudent:"+studentId);
		Session currentSession = sessionFactory.getCurrentSession();
		Student theCustomer = currentSession.get(Student.class, studentId);
		return theCustomer;
	}

}

