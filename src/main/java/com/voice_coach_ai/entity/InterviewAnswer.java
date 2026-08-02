package com.voice_coach_ai.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "interview_answer")
public class InterviewAnswer {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	 	
	    @ManyToOne
	    private Interview interview;
	    
	    @Column
	    private int questionNumber;

	    @Column(columnDefinition = "TEXT")
	    private String question;
	    
	    @Column(columnDefinition = "TEXT")
	    private String answer;

	    public InterviewAnswer(Long id, Interview interview, int questionNumber, String question, String answer) {
			super();
			this.id = id;
			this.interview = interview;
			this.questionNumber = questionNumber;
			this.question = question;
			this.answer = answer;
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

		public int getQuestionNumber() {
			return questionNumber;
		}

		public void setQuestionNumber(int questionNumber) {
			this.questionNumber = questionNumber;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		
	

}
