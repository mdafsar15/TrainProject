package com.booking.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.App.dto.User;
import com.booking.App.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User findUserByEmailOrMobileNoOrUserName(String loginData) {
		User user = userRepository.findUserByEmailOrMobileNoOrUserName(loginData);
		return user;
	}
	
}
