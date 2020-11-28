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
public class SpringController {

	@Autowired
	SpringService springService;
	
	@GetMapping("getallemployee")
	public List<Demo> getAllEmpolee() {
		System.out.println("helloHi Rashi");
		List<Demo> listOfEmp = springService.getAllEmpolee();
		return listOfEmp;
	}
	@RequestMapping("/showallemployeebyid/{id}")
    public List<Demo> showallemployeebyid(@PathVariable int id){
    List<Demo> listemp=springService.showallemployeebyid(id);
	    return listemp;
    }
}
