package com.capg.jpa.p3;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(
		 name = "Exam_Type",
		 discriminatorType =DiscriminatorType.STRING
		)
public class Examination implements Comparable<Examination>,Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int exam_Id;
	private String examType;

	
	
	public int getExam_Id() {
		return exam_Id;
	}

	public void setExam_Id(int exam_Id) {
		this.exam_Id = exam_Id;
	}


	public String getExamType() {
		return examType;
	}


	public void setExamType(String examType) {
		this.examType = examType;
	}
	
	

	public Examination(int exam_Id, String examType) {
		super();
		this.exam_Id = exam_Id;
		this.examType = examType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((examType == null) ? 0 : examType.hashCode());
		result = prime * result + exam_Id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examination other = (Examination) obj;
		if (examType == null) {
			if (other.examType != null)
				return false;
		} else if (!examType.equals(other.examType))
			return false;
		if (exam_Id != other.exam_Id)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Examination [exam_Id=" + exam_Id + ", examType=" + examType + "]";
	}

	@Override
	public int compareTo(Examination o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
