package com.jbs.SpringBootHBTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbs.SpringBootHBTest.entity.Demo;
import com.jbs.SpringBootHBTest.service.SpringService;

@RestController
@RequestMapping("/api")
public class SpringController {

	@Autowired
	SpringService springService;
	
	@GetMapping("getallemployee")
	public List<Demo> getAllEmpolee() {
		System.out.println("Committed by Dipak ");
		//System.out.println("Committed by Atul");
		//System.out.println("Committed by Sachin");
		//System.out.println("satara");
		System.out.println("committed by Anjali padmawar..");
		System.out.println("GetAllEmployee Controller...");
		List<Demo> listOfEmp = springService.getAllEmpolee();
		return listOfEmp;
		
		//return "hi";
	}
	
	/*
	 * @GetMapping("getbyid/{id}") public Demo getbyid(@PathVariable int id) { Demo
	 * demo =springService.getbyid(id);
	 * 
	 * return demo;
	 * 
	 * 
	 * }
	 */
	
}
