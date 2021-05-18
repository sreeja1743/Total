package com.abc.beans;

public class Course {	
  public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


private String courseName;
  private int courseId;
  
  public String getCourseName() {
	return courseName;
  }
  public void setCourseName(String courseName) {
	this.courseName = courseName;
  }

  public int getCourseId() {
	return courseId;
  }
  public void setCourseId(int courseId) {
	this.courseId = courseId;
  }
  
  
@Override
public String toString() {
	return "Course [courseName=" + courseName + ", courseId=" + courseId + "]";
}
  
  
  
  
  
}
