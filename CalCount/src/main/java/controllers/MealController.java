package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Meal;
import services.MealService;

@RestController
@RequestMapping("/meals")
public class MealController {
	
	@Autowired
	private MealService mealService;
	
	public Meal findById(int Id) {
		return mealService.findById(Id);
	}

}
