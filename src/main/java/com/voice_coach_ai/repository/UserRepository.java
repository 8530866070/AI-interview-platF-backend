package com.voice_coach_ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voice_coach_ai.entity.User;

public interface UserRepository  extends JpaRepository<User , Long>{
	
	

}
