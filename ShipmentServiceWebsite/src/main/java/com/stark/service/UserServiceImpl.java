package com.stark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stark.dao.UserRepository;
import com.stark.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User authenticateUser(String email, String password) {
		
		return userRepo.findByEmailAndPassword(email, password)
				.orElseThrow(() -> new RuntimeException("User login failed : Invalid Credentials"));
	}
	
	@Override
	public User registerCust(User C) {
		
		return userRepo.save(C);
	}
	
}
