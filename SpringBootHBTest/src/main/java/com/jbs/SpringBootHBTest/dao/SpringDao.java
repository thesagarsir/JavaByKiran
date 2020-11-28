package com.jbs.SpringBootHBTest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbs.SpringBootHBTest.configuration.SpringConfiguration;
import com.jbs.SpringBootHBTest.entity.Demo;

@Repository
public class SpringDao {
	@Autowired
	private EntityManager entityManager;
	SessionFactory sessionFactory =  SpringConfiguration.getSession();
	
	public List<Demo> getAllEmpolee() {
		Session session = sessionFactory.openSession();
	 Transaction tr = 	session.beginTransaction();
		Criteria criteria = session.createCriteria(Demo.class);
		List<Demo> listOfEmp =  criteria.list();
		tr.commit();
		session.close();
		return listOfEmp;
		
		
	}
	public Demo getbyid(int id) {
		Session session = entityManager.unwrap(Session.class);
		Demo demo =session.get(Demo.class, id);
		return demo;
		
	}

}
