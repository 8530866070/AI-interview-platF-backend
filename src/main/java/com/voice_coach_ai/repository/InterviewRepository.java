package com.voice_coach_ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voice_coach_ai.entity.Interview;

public interface InterviewRepository extends JpaRepository<Interview , Long> {

}
