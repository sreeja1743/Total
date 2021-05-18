package com.capg.jpa.p3;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

import com.capg.jpa.p2.Hotels;

@Entity   
@Table(name = "Course")
public class Courses {
   
	@Id
	private int courseId;
	private String courseName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="StdCourses",
			joinColumns=@JoinColumn(name="courseId"),
			inverseJoinColumns=@JoinColumn(name="stdId"))
	private List<StudentInfo> studentInfo;
	
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<StudentInfo> getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(List<StudentInfo> studentInfo) {
		this.studentInfo = studentInfo;
	}


	
	
}
