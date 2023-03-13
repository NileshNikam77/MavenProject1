package com.Practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	@Column(name="Answers")
	private String ans;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Answer(int aid, String ans) {
		super();
		this.aid = aid;
		this.ans = ans;
	}
	public Answer() {
		super();
		
	}

	
}
