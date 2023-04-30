package com.cedm.app.mongo.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.cedm.app.mongo.models.User;
import com.cedm.app.mongo.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController2 {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/say")
	public String sayHello() {
		return "Hello Spring boot";
	}

	public void getUserByUsername(String name) {
		System.out.println("Getting item by name: " + name);
		userRepository.findItemByName(name);
	}

	@GetMapping("/check")
	public void getUserByUsername1(String username) {
		List<User> tweets = userRepository.findAll();

	}

}
