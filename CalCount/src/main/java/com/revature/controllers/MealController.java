package com.revature.controllers;

import java.time.LocalDate;
import java.util.List;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.revature.models.Meal;
import com.revature.services.MealService;

@RestController
@RequestMapping("/meals")
public class MealController {
	
	@Autowired
	private MealService mealService;

	public MealController(MealService mealService) {
		this.mealService = mealService;
	}

	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveMeal(@RequestBody Meal meal) {
		mealService.saveMeal(meal);
	}
	
	@GetMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Meal> findAll(){
		return mealService.findAll();
	}
	
	@GetMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Meal findById(@RequestParam int Id) {
		return mealService.findById(Id);
	}

	@GetMapping(path = "/{date}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Meal> findByDate(@RequestParam LocalDate date) {
		return mealService.findByDate(date);
	}
}
