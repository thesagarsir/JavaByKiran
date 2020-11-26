package com.jbs.SpringBootHBTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbs.SpringBootHBTest.entity.Demo;
import com.jbs.SpringBootHBTest.service.SpringService;

@RestController
public class SpringController {

	@Autowired
	SpringService springService;
	
	@GetMapping("getallemployee")
	public List<Demo> getAllEmpolee() {
		System.out.println("helloHi Rashi");
		List<Demo> listOfEmp = springService.getAllEmpolee();
		return listOfEmp;
	}
}
