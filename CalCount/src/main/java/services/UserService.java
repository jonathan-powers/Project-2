package com.revature.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.UserRepository;

@Transactional

@Service("userService")
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User findbyEmailAndPassword(String email, String password) {
		return userRepository.findbyEmailAndPassword(email, password);
	}
	
	public User findbyId(int id) {
		return userRepository.findbyId(id);
	}
}
