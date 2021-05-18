package com.capg.emsapp.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.service.EmployeeServiceImpl;
import com.capg.emsapp.service.IEmployeeService;

public class MainUIClass {
	Scanner sc;
	IEmployeeService empService;
	
	public MainUIClass() {
		empService = new EmployeeServiceImpl();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		MainUIClass obj = new MainUIClass();
		
		
		// menu based program 
		obj.displayAllEmployee();
		obj.insertEmployeeInforamtion();
		obj.displayAllEmployee();
		obj.sortedBySalaryList();
		obj.highestExperience();
		
	}
	
	public void insertEmployeeInforamtion()
	{
		System.out.println(" \n Enter Employee Informations \n");
		System.out.println(" Enter Employee Name ");
		String empName = sc.nextLine();
		
		System.out.println(" Enter Employee Id ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Employee Salary ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Project  Name ");
		String projectName = sc.nextLine();
		
	    System.out.println("Enter years of experience");
	    int experience = sc.nextInt();
		Employee e = new Employee(empName, id, salary, projectName, experience);
		
		try
		{
			@SuppressWarnings("unused")
			boolean isInserted = empService.insertEmployee(e);
			
			// -----
		}
		catch(Exception excep)
		{
			
			System.out.println(" Contact HR "+excep);
		}
		
		
	}
	
	public void displayAllEmployee()
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployees();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(" Name "+e.getEmpName());
		System.out.println(" ID "+e.getId());
		System.out.println(" Salary "+e.getSalary());
		System.out.println("Experience "+e.getExperience());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	public void sortedBySalaryList() {
		System.out.println("\n=========== Employees information sorted by salary ===========\n");
		List<Employee> empList = empService.lowToHighSalary();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	public void highestExperience() {
		Employee e = empService.getEmpByHighestexperience();
		System.out.println("\n==========Employee with highest experience===========");
		displayEmployee(e);
	}

}