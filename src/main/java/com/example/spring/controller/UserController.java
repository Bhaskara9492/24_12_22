package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entities.UserEntity;
import com.example.spring.model.User;
import com.example.spring.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/getAllUsers")
	public List<UserEntity> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("getByName/{name}")
	public UserEntity getUserByFirstName(@PathVariable String name) {
		System.out.println(name);
		return userService.getByFirstName(name);
	}
	
}
