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
	
	public List<User> findUserFriends(int id) {
		ArrayList<User> friends = new ArrayList<User>();
		User user = userRepository.findById(id);
		for (int friendId : user.getFriends()) {
			User friend = userRepository.findById(friendId);
			friends.add(friend);
		}
		
		return friends;
	}
	
	public void addFriend(int user_id, int friend_id) {
		User user = userRepository.findById(user_id);
		User friend = userRepository.findById(friend_id);
		ArrayList<Integer> userFriends = user.getFriends();
		userFriends.add(friend.getId());
		user.setFriends(userFriends);
	}
	
	public User findById(int id) {
		return userRepository.findById(id);
	}
}