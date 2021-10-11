package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Meal;
import com.revature.repositories.MealRepository;


@Service
public class MealService {
	
	@Autowired
	private MealRepository mealRepository;
	
	public Meal findById(int Id) {
		return mealRepository.findById(Id);
	}

	public void saveMeal(Meal meal) {
		mealRepository.save(meal);	
	}

}
