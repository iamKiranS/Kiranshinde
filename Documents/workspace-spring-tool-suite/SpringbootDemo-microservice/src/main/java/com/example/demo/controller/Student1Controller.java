package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student1")
public class Student1Controller {

	public static List<String> list = new ArrayList<String>();
	static {
		list.add("Kiran");
		list.add("Mumabi");
		list.add("Java Developer");
	}
	
	@GetMapping("/getInfo")
	public List<String> getStudentDeatiles(){
		return list;
		
	}
	
}
