package com.jbs.SpringBootHBTest.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.springframework.stereotype.Repository;

import com.jbs.SpringBootHBTest.configuration.SpringConfiguration;
import com.jbs.SpringBootHBTest.entity.Demo;

@Repository
public class SpringDao {

	SessionFactory sessionFactory =  SpringConfiguration.getSession();
	
	public List<Demo> getAllEmpolee() {
System.out.println("In DAO class");
		Session session = sessionFactory.openSession();
	 Transaction tr = 	session.beginTransaction();
		Criteria criteria = session.createCriteria(Demo.class);
		List<Demo> listOfEmp =  criteria.list();
		tr.commit();
		session.close();
		return listOfEmp;
		
		
	}

}
