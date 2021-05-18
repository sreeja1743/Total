package com.abc.beans;

public class Student {
   private String studentName;
   private int stdId;
   private Course course;
   
   
   
   public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String studentName, int stdId) {
	super();
	this.studentName = studentName;
	this.stdId = stdId;
   }
   
   public String getStudentName() {
	return studentName;
   }
   
  public void setStudentName(String studentName) {
	this.studentName = studentName;
  }
  
  public int getStdId() {
	return stdId;
  }
  
  public void setStdId(int stdId) {
	this.stdId = stdId;
  }
  
  
public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}

@Override
public String toString() {
	return "Student [studentName=" + studentName + ", stdId=" + stdId + ", course=" + course + "]";
}


   
   
}
