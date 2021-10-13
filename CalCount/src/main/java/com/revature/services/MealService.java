package com.revature.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Meal;
import com.revature.repositories.MealRepository;


@Service
public class MealService {
	
	@Autowired
	private MealRepository mealRepository;
	
	public List<Meal> findAll(){
		return mealRepository.findAll();
	}
	
	public Meal findById(int Id) {
		return mealRepository.findById(Id);
	}

	public void saveMeal(Meal meal) {
		meal.setDate(LocalDate.now());
		mealRepository.save(meal);	
	}

	public List<Meal> findByDate(LocalDate date) {
		return mealRepository.findByDate(date);
	}

}
