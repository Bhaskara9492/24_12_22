package com.example.spring.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entities.UserEntity;
import com.example.spring.model.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String saveUser(User user) {
		System.out.println("user in Service Layer : " + user);

		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPhone(user.getPhone());

		userRepository.save(userEntity);

		return "Succesfully Saved the User";
	}

}
