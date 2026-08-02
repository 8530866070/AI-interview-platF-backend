package com.voice_coach_ai.entity;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "interview")
public class Interview {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Which user started this interview
	 
    @ManyToOne
    private User user;
	 
	 @Column(nullable = false)
    private String category;      // Java, Spring Boot, React
	 
	 @Column(nullable = false)
    private String difficulty;// Easy, Medium, Hard
	 
	 @Column
    private int currentQuestion;  // 1,2,3...10

	 @Column
    private boolean completed;    // false = running, true = finished

	 @Column
    private LocalDateTime startedAt;

	 public Interview(Long id, User user, String category, String difficulty, int currentQuestion, boolean completed,
			LocalDateTime startedAt) {
		super();
		this.id = id;
		this.user = user;
		this.category = category;
		this.difficulty = difficulty;
		this.currentQuestion = currentQuestion;
		this.completed = completed;
		this.startedAt = startedAt;
	 }

	 public Long getId() {
		 return id;
	 }

	 public void setId(Long id) {
		 this.id = id;
	 }

	 public User getUser() {
		 return user;
	 }

	 public void setUser(User user) {
		 this.user = user;
	 }

	 public String getCategory() {
		 return category;
	 }

	 public void setCategory(String category) {
		 this.category = category;
	 }

	 public String getDifficulty() {
		 return difficulty;
	 }

	 public void setDifficulty(String difficulty) {
		 this.difficulty = difficulty;
	 }

	 public int getCurrentQuestion() {
		 return currentQuestion;
	 }

	 public void setCurrentQuestion(int currentQuestion) {
		 this.currentQuestion = currentQuestion;
	 }

	 public boolean isCompleted() {
		 return completed;
	 }

	 public void setCompleted(boolean completed) {
		 this.completed = completed;
	 }

	 public LocalDateTime getStartedAt() {
		 return startedAt;
	 }

	 public void setStartedAt(LocalDateTime startedAt) {
		 this.startedAt = startedAt;
	 }

}
