package com.example.spring.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	
	
	@Transactional
	@DeleteMapping("/deleteUser/{name}")
	public String deleteUser(@PathVariable String name) {
		
		
		return userService.deleteUser(name);
	}

	@PutMapping("/updateUser")
	public UserEntity updateUser(@RequestBody User user){

		return userService.updateUser(user);
	}

	
	
	
}
