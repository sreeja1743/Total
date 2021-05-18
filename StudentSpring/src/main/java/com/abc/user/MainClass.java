package com.abc.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.beans.Student;

public class MainClass {
	
   public static void main(String[] args) {
	ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("Spring-factory.xml");
	Student std1 = (Student)spring.getBean("student");
	

	System.out.println(std1);
	System.out.println(std1.getStdId());
	System.out.println(std1.getCourse().getCourseId());
	System.out.println(std1.getCourse().getCourseName());
	
  }
}
