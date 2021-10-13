package com.revature.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Meal;
import com.revature.repositories.MealRepository;

@Transactional

@Service("mealService")
public class MealService {
	@Autowired
	private MealRepository mealRepository;
	
	public void save(Meal meal) {
		mealRepository.save(meal);
	}
	
	public Meal findbyId(int id) {
		return mealRepository.findbyId(id);
	}
}
