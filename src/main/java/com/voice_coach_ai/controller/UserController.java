package com.voice_coach_ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.voice_coach_ai.entity.User;
import com.voice_coach_ai.service.UserService;

@RestController

public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/createuser")
	public User createUser(@RequestBody User user) {
		
		return userService.createUser(user);	
	}
	

}





