package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public void saveUser(User user) {
		ArrayList<User> emptyList = new ArrayList<User>();
		user.setFriends(emptyList);
		userRepository.save(user);
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
		
	}
}
