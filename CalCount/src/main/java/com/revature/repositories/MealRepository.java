package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.models.Meal;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
	
	public Meal findById(int Id);

	public List<Meal> findByDate(LocalDate date);
}
