package com.jbs.SpringBootHBTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbs.SpringBootHBTest.dao.SpringDao;
import com.jbs.SpringBootHBTest.entity.Demo;

@Service
public class SpringService {

	@Autowired
	SpringDao springDao;
	
	public List<Demo> getAllEmpolee() {
		
		List<Demo> listofEmp = springDao.getAllEmpolee();
		return listofEmp;
	}

}
