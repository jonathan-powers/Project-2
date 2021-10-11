package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reavture.models.User;
import com.revature.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public void saveMeal(User user) {
		userRepository.save(user);
	}
}
