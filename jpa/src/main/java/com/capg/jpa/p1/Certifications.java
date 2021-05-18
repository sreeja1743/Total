package com.capg.jpa.p1;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certifications {
	@Column(name = "techCertName")
	private String techCertName;
	
	
	public Certifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certifications(String techCertName) {
		super();
		this.techCertName = techCertName;
		
	}
	public String getTechCertName() {
		return techCertName;
	}
	public void setTechCertName(String techCertName) {
		this.techCertName = techCertName;
	}
	
	
}
