package com.capg.jpa.p3;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainExamClass {

	
	public static void main(String[] args) {
	
		Examination ex = new Examination(11, "Sem");
		MidExam me = new MidExam(12, "mid", "viditha", 102);
		SemExam se = new SemExam(11, "sem", "D", 112, "Sri", 127);
		
		
		
		Configuration cfg = new Configuration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();

		
		Transaction t = session.beginTransaction();
		
		session.save(ex);
		session.save(me);
		session.save(se);
		t.commit();
		System.out.println(" Data Saved");
		
     }
	
}
