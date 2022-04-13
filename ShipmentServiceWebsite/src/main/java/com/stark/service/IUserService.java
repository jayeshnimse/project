package com.stark.service;

import com.stark.pojos.User;

public interface IUserService {

	
		 
	User authenticateUser(String email, String pass);
	User registerCust(User C);
}
