package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;
import com.revature.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://calcount-bucket.s3-website-us-west-1.amazonaws.com")
//@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping(path = "/{id}/friends", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUserFriends(@RequestParam int id){
        return userService.findUserFriends(id);
    }

    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User Login(String email, String password) {
        return userService.findUserByEmailAndPassword(email, password);
    }

    @GetMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User findById(int id) {
        return userService.findById(id);
    }

    @PutMapping(path = "/{user_id}/add/{friend_id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addFriend(@RequestParam int user_id, 
            @RequestParam int friend_id){
        userService.addFriend(user_id, friend_id);
    }

}
