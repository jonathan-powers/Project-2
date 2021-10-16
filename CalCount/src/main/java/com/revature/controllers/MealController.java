package com.revature.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Meal;
import com.revature.services.MealService;

@RestController
@RequestMapping("/meals")
@CrossOrigin("http://localhost:4200")
public class MealController {

	@Autowired
	private MealService mealService;

	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveMeal(@RequestBody Meal meal) {
		mealService.saveMeal(meal);
	}

	@GetMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Meal> findAll() {
		return mealService.findAll();
	}

	@GetMapping(path = "/{Id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Meal findById(@RequestParam int Id) {
		return mealService.findById(Id);
	}

	@GetMapping(path = "/{Date}/users/{user_Id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Meal> findByUserAndDate(@RequestParam int user_Id, @RequestParam LocalDate Date){
		return mealService.findByUserAndDate(user_Id, Date);
	}

}
