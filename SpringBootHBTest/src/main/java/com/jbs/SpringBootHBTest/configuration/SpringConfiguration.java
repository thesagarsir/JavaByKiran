package com.jbs.SpringBootHBTest.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbs.SpringBootHBTest.entity.Demo;

public class SpringConfiguration {

	
	public static SessionFactory getSession() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Demo.class);
		System.out.println("Read CFG file....");
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
}
