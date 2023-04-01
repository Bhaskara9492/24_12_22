package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	//UserEntity findByFirstName(String name);
	
	@Query(name = "select * from user where first_name :'name'", nativeQuery=true)
	UserEntity findByFirstName(@Param("name") String name);

	int deleteByFirstName(String name);

}
