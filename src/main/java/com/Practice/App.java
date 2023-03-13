package com.Practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
	//creating question
		
		Question q=new Question();
		
		q.setqid(11);
		q.setque("who are you");
		
Question q1=new Question();
		
		q1.setqid(12);
		q1.setque(" where are you");
		
	
		
		
		//creating Answer
		Answer a=new Answer();
		
		a.setAid(100);
		a.setAns("im nilesh nikam");
		
Answer a1=new Answer();
		
		a1.setAid(200);
		a1.setAns("im in mumbai");
		
		q.setans(a);
		q1.setans(a1);
		
		Session sn=factory.openSession();
		
		Transaction tx=sn.beginTransaction();
		
		sn.save(a1);
		sn.save(a);
		sn.save(q);
		sn.save(q1);
		
		sn.close();
		tx.commit();
		
		 factory.close();
	       System.out.println("done");
	}
}
