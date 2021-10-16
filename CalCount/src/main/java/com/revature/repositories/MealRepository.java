package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
	
	public Meal findById(int Id);
	
}