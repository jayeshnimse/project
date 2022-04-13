package com.stark.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stark.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User>  findByEmailAndPassword(String email,String password);
	
}
