package com.capg.emsapp.beans;

public class Employee implements Comparable<Employee>{
	
	private String empName;
	private int id;
	private int salary;
	private String projectName;
	private Project project;
	private int experience;
	
	public Employee() {
		
		super();
		
	}
	
	public Employee(String empName, int id, int salary, String projectName, int experience) {
		super();
		this.empName = empName;
		this.id = id;
		this.salary = salary;
		this.projectName = projectName;
		this.experience = experience;
	}
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	public Project getProject() {
		return project;
	}
	
	public void setProject(Project project) {
		this.project = project;
	}
	
	@Override
	public int hashCode() {
	  // 1000 line code
		
		int myHashCode = 0;
		myHashCode = empName.length()+id+projectName.length();
		return myHashCode;
	}
	

	@Override    //        (Animal a)
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Employee)
		{
		  Employee e = (Employee)obj;	
		  
		  boolean a = this.empName.equals(e.empName);
		  boolean b = (this.id == e.id);
		  boolean c = this.salary == e.salary;
		  boolean d = this.projectName.equals(e.projectName);
		  
		  return a&&b&&c&&d;
			
		}
		return false;
	}
	
	public int compareTo(Employee o) {
		return this.id - o.getId();
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", id=" + id + ", salary=" + salary + ", projectName=" + projectName
				+ ", project=" + project + "]";
	}

	
}
