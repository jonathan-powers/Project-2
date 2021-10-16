package com.revature.repositories;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Meal;
import com.revature.models.User;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
	
	public Meal findById(int Id);
	
	public ArrayList<Meal> findAllByUserAndDate(User user, LocalDate date);
}