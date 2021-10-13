package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Meal;

public interface MealRepository extends JpaRepository<Meal, Long>{
	public Meal findbyId(int id);
}
