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

	public User findUserByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	public void saveUser(User user) {
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		user.setFriends(emptyList);
		userRepository.save(user);
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
}