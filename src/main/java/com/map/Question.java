package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;



@Entity
public class Question {
     
	
    @Id
    @Column(name="question_id")
	private int QuestionID;
    @Column
	private String question;
	@OneToOne
    private Answer answer;

	
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public int getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public Question(int questionID, String question, Answer answer) {
		super();
		QuestionID = questionID;
		this.question = question;
		this.answer = answer;
	}
	public Question() {
		
		super ();
	}
	
	
}
