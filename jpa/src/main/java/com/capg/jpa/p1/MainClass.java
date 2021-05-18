package com.capg.jpa.p1;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
	
			
		Student s = new Student();
		s.setStdId(102);
		s.setStudentName("ram");
		Certifications techCertName = new Certifications("bvr");
		s.setTechCertName(techCertName);
		Certifications nonTechCertName = new Certifications("sports");
		s.setNonTechCertName(nonTechCertName);
		s = (Student)session.get(Student.class, 101);
		session.saveOrUpdate(s);  // insert into Account .....
	
		System.out.println("  -->> Data Saved ..");
		t.commit();
			
		
		////jdbc:oracle:thin:@127.0.0.1:1521:XE
		
		session.close();
		System.out.println("All Done");
		
		
	}
}