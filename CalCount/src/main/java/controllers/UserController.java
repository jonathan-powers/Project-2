package com.revature.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.revature.exceptions.UserException;
import com.revature.models.User;
import com.revature.services.UserService;

@RestController("UserController")

@RequestMapping("/users")
public class UserController {
	private UserService userService;
	
	@PostMapping(path = "/create-account", consumes = MediaType.APPLICATION_JSON_VALUE)
	public RedirectView saveUser(@RequestBody User user) {
		userService.save(user);
		return new RedirectView("/login");
	}
	
	@GetMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public RedirectView findByEmailAndPassword(String email, String password) {
		User result = userService.findbyEmailAndPassword(email, password);
		if (result != null) {
			return new RedirectView("/week-page");
		}
		return new RedirectView("/login");
	}
	
	@GetMapping(path = "/exception")
	public void throwUserException() {
		throw new UserException();
	}
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User findbyID(@RequestParam int id) {
		return this.userService.findbyId(id);
	}
}
