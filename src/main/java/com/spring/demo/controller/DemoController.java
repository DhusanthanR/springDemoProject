package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.models.User;
import com.spring.demo.repository.UserRepository;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/getData")
	public List<User> getData() {
		
		System.out.println(userRepo.findAll().toString());
		
		List<User> allUser = userRepo.findAll();
		
		return allUser;
	}
}
