package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT FROM Users WHERE Email = ?1 AND Password = ?2")
	public User findbyEmailAndPassword(String email, String password);
	@Query("SELECT FROM Users WHERE Id = ?1")
	public User findbyId(int id);
	@Query("INSERT INTO Users (Id, Name, Email, Password, Height, Weight, Friends)"
			+ "VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7)")
	public User save(User user);
}
