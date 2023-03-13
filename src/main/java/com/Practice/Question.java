package com.Practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	@Column(name = "Question")
	private String que;
   @OneToOne
	private Answer ans;

	public int getqid() {
		return qid;
	}

	public void setqid(int qid) {
		this.qid = qid;
	}

	public String getque() {

		return que;
	}

	public void setque(String que) {
		this.que = que;

	}

	public Answer getans() {

		return ans;
	}

	public void setans(Answer ans) {
		this.ans = ans;

	}
	
	public Question(int qid,  String que, Answer ans) {
		this.ans=ans;
		this.qid=qid;
		this.que=que;
		
	}
	
	public Question() {
		
		super();
	}

		
	}

