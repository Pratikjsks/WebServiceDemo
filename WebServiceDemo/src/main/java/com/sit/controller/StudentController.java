package com.sit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.model.Student;

@RestController
public class StudentController 
{
	@RequestMapping("/")
	public String preLogin()
	{
		return "Welcome skills IT Academy";
	}
	
	@RequestMapping("/login")
	public String Login()
	{
		return "Login Successfully";
	}
	
	//@RequestMapping(path="/registerpage",method=RequestMethod.GET)
	@GetMapping("/registerpage")
	public Student login()
	{
		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("Old Bokhya Mazhya Manya");
		stu.setAddr("Home Sweet Home");
		stu.setEmail("cutemanya@gmail.com");
		return stu;
	} 
}
