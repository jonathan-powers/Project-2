package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reavture.models.Meal;


@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {
	
	public Meal findById(int Id); 
}
