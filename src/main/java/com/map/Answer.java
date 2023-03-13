package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	private int AnswerID;
	@Column
	private String answer;
	
	
	
	public int getAnswerID() {
		return AnswerID;
	}
	public void setAnswerID(int answerID) {
		AnswerID = answerID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int answerID, String answer) {
		super();
		AnswerID = answerID;
		this.answer = answer;
	}
	
	public Answer() {
		super ();
	}

	
	
	
}
