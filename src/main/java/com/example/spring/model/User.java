package com.example.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {

	private String firstName;

	private String lastName;

	private String email;

	private String address;

	private String phone;

}
