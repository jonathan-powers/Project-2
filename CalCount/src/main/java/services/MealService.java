package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Meal;
import repositories.MealRepository;


@Service
public class MealService {
	
	@Autowired
	private MealRepository mealRepository;
	
	public Meal findById(int Id) {
		return mealRepository.findById(Id);
	}

}
