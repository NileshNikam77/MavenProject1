package com.map;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        Configuration cfg=new Configuration();                       
        cfg.configure("Hiber.cfg.xml"); 
        SessionFactory factory=cfg.buildSessionFactory();
       
        //creating question
        
        Question q=new Question();
        q.setQuestionID(11);
        q.setQuestion("what is java ?");
        
        
        //creating answer
        
        Answer a=new Answer();
        
        a.setAnswerID(12);
        a.setAnswer("java is programming language");
        
        q.setAnswer(a);
        
       
        Session session1 = factory.openSession();
       Transaction tx=session1.beginTransaction();
       
     session1.save(q);
     session1.save(a);
       
       tx.commit();
       
       session1.close();
       
       factory.close();
       System.out.println("done");
       
       
    }
}
