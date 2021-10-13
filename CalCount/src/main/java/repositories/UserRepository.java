package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findbyEmailAndPassword(String email, String password);
	public User findbyId(int id);
}
