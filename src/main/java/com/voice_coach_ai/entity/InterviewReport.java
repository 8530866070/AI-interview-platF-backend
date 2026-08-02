package com.voice_coach_ai.entity;

import jakarta.persistence.*;

@Entity
@Table(name="interview_report")
public class InterviewReport {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	  @OneToOne
	    private Interview interview;
	  

	    @Column
	    private double overallScore;

	    @Column(columnDefinition = "TEXT")
	    private String feedback;

		public InterviewReport(Long id, Interview interview, double overallScore, String feedback) {
			super();
			this.id = id;
			this.interview = interview;
			this.overallScore = overallScore;
			this.feedback = feedback;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Interview getInterview() {
			return interview;
		}

		public void setInterview(Interview interview) {
			this.interview = interview;
		}

		public double getOverallScore() {
			return overallScore;
		}

		public void setOverallScore(double overallScore) {
			this.overallScore = overallScore;
		}

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}
	    
	    

}
