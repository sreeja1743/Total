package com.capg.jpa.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainClass {
	
	
	
    public static void main(String args[]) {
    	
	MainClass obj = new MainClass();
	
	Configuration cfg = new Configuration();
	SessionFactory fac = cfg.configure().buildSessionFactory();
	Session session = fac.openSession();
	
	StudentInfo std1 = obj.getStudentInfo(); // sri
	StudentInfo std2 = obj.getStudentInfo(); // ram

	
	Courses course1 = obj.getCourseInfo(); //Java
	Courses course2 = obj.getCourseInfo(); //Python
	
	///-----------------------------------
	List<Courses> courseList_Std1 = new ArrayList<Courses>();
     courseList_Std1.add(course1);
     courseList_Std1.add(course2);
    
     

     List<Courses> courseList_Std2 = new ArrayList<Courses>();
     courseList_Std2.add(course1);
     courseList_Std2.add(course2);
     
 
     
     
   // -------------------------------------------------- 
     List<StudentInfo> stdList_1 = new ArrayList<StudentInfo>();
     stdList_1.add(std1);
     stdList_1.add(std2);
     
     List<StudentInfo> stdList_2 = new ArrayList<StudentInfo>();
     stdList_2.add(std1);
     stdList_2.add(std2);
     
     

  
  
    
     course1.setStudentInfo(stdList_1);
     course2.setStudentInfo(stdList_2);
     
     std1.setCourses(courseList_Std1);
     std2.setCourses(courseList_Std2);
 
     
     Transaction t = session.beginTransaction();
     
        session.save(std1);
		session.save(std2);
		
		
		session.save(course1);
		session.save(course2);
		
		
        t.commit();
		
		System.out.println(" Data Saved");	
	
    }
    
    
  
    
    public Courses getCourseInfo() {
		Courses course = new Courses();
		

		System.out.println("Enter course name");
		course.setCourseName(new Scanner(System.in).nextLine());
		
		System.out.println("Enter course id");
		course.setCourseId(new Scanner(System.in).nextInt());
		
		
		
		return course;
	}


	public StudentInfo getStudentInfo() {
		StudentInfo std = new StudentInfo();
		
		System.out.println("Enter student name");
		std.setStdName(new Scanner(System.in).nextLine());
		
		
		System.out.println("Enter student id");
		std.setStdId(new Scanner(System.in).nextInt());
		
		
		return std;
	}

  
    
}





















