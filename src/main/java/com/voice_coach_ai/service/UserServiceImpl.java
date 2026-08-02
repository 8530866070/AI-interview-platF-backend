package com.voice_coach_ai.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voice_coach_ai.entity.Role;
import com.voice_coach_ai.entity.User;
import com.voice_coach_ai.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository; 
	
	@Override 
	public User createUser(User user) {
		
		return userRepository.save(user); 
	}

	
	  

} 
