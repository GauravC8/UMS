package com.niit.app.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.app.model.Assignment;
import com.niit.app.model.Student;
import com.niit.app.model.User;

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
	public void deleteStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.byId(Student.class).load(id);
	//	User user = new User();
		//user.setStudentId(id);
		//user = session.byId(User.class).load(user.getStudentId());
		//user = session.get(User.class, user.getStudentId());
		session.delete(student);
		//session.delete(user);
	}

	@Override
	public void saveStudent(Student student) {
		Session currentSession = sessionFactory.getCurrentSession();
		//Transaction tx = currentSession.beginTransaction();
	//	student.setId(7);
		 User user = new User(); 
	  //  user.setStudent(student);
	    user.setEmailId(student.getEmailId());
	    user.setPassword(student.getPassword());
		user.setRole("s");
		 student.setUser(user);
		System.out.println("save Student::::"+student);
		currentSession.saveOrUpdate(student);
		//currentSession.saveOrUpdate(user);
		///int id = (Integer)currentSession.save(student);
		/*
		 * User user = new User(); user.setId(id); currentSession.save(object)
		 */
	//	tx.commit();
	//	currentSession.close();
	}
	
	@Override
	public void saveAssignements(Assignment assign) {
		Session currentSession = sessionFactory.getCurrentSession();
	
		System.out.println("save assignments::::"+assign);
		currentSession.saveOrUpdate(assign);
		
	}

	@Override
	public Student getStudent(String emailId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student theCustomer = currentSession.get(Student.class, emailId);
		System.out.println("getStudent:"+theCustomer);
		return theCustomer;
	}
	
	@Override
	public Student showStudent(int studentId) {
		System.out.println("showStudent:"+studentId);
		Session currentSession = sessionFactory.getCurrentSession();
		Student theCustomer = currentSession.get(Student.class, studentId);
		return theCustomer;
	}
}