package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.Meal;

public interface MealRepository extends JpaRepository<Meal, Long>{
	@Query("SELECT FROM Meals WHERE Id = ?1")
	public Meal findbyId(int id);
	
	@Query("INSERT INTO Meals (Id, User, Name, Description, Excercise, Calories, Date)"
			+ "VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7")
	public Meal save(Meal meal);
}
