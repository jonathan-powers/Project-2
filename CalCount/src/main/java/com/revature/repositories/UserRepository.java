package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reavture.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
}
