package com.example.spring.service;

import java.util.List;

import com.example.spring.entities.UserEntity;
import com.example.spring.model.User;

public interface UserService {

	String saveUser(User user);

	List<UserEntity> getAllUsers();
	
	UserEntity getByFirstName(String name);

	String deleteUser(String name);

}
