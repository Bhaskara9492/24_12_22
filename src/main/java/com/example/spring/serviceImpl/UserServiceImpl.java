package com.example.spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entities.UserEntity;
import com.example.spring.model.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

import javax.jws.soap.SOAPBinding;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String saveUser(User user) {
        System.out.println("user in Service Layer : " + user);

        userRepository.save(UserEntity.builder().firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phone(user.getPhone()).build());

        return "Succesfully Saved the User";
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getByFirstName(String name) {
        return userRepository.findByFirstName(name);
    }

    @Override
    public String deleteUser(String name) {

        userRepository.deleteByFirstName(name);
        return "User Deleted Succesfully";
    }

    @Override
    public UserEntity updateUser(User user) {

        UserEntity userEntity = userRepository.findByFirstName(user.getFirstName());

       return userRepository.save(userEntity.builder().firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phone(user.getPhone()).build());


    }

}
