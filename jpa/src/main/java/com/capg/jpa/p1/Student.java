package com.capg.jpa.p1;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.*;
import java.util.Date;
import java.util.Locale;

import org.hibernate.annotations.Generated;
@Entity   
@Table(name = "Students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "StudentId")
	private int stdId;
	
	@Column(name=" StudentName")
	private String studentName;

    @Embedded
    private Certifications techCertName;
    
    
    @Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "techcertificate",column = @Column(name="nontechCertificate")),
	})
    private Certifications nonTechCertName;
    
    

	public Certifications getTechCertName() {
		return techCertName;
	}

	public void setTechCertName(Certifications techCertName) {
		this.techCertName = techCertName;
	}

	public Certifications getNonTechCertName() {
		return nonTechCertName;
	}

	public void setNonTechCertName(Certifications nonTechCertName) {
		this.nonTechCertName = nonTechCertName;
	}

	public Student(int stdId, String studentName) {
		super();
		this.stdId = stdId;
		this.studentName = studentName;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", studentName=" + studentName + ", techCertName=" + techCertName
				+ ", nonTechCertName=" + nonTechCertName + "]";
	}

	
	
	
   
}
