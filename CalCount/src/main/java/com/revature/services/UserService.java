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
		userRepository.save(user);
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
		
	}

	public List<User> findUserFriends(int id) {
		ArrayList<User> friends = new ArrayList<User>();
		User user = userRepository.findById(id);
		for (int friendId : user.getFriends()) {
			User friend = userRepository.findById(friendId);
			friends.add(friend);
		}
		
		return friends;
	}
}
