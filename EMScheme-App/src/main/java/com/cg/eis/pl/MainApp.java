package com.cg.eis.pl;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;
import java.util.*;

public class MainApp {
	Scanner sc = new Scanner(System.in);
	EmployeeService emp = new EmployeeService();
	Map<Integer,List<Employee>> salaryEmpMap;
	
   public static void main(String[] args) {
	   
	 MainApp obj = new MainApp();
	System.out.println("1)Insert data:");
	System.out.println("DisplayAllemployee");
	System.out.println();
	 while(true) {
	  switch(obj.sc.nextInt()) {
	  
	  case 1:obj.insertData();
	         break;
	  case 2: obj.displayAllEmployee();
	          break;
	  case 3: obj.sortedBySalaryList();
	          break;
	  case 4: obj.salaryEmploye();
	          break;
	  case 5: System.exit(0);
	  }
	  }
   }
   
   public void insertData() {
	   boolean i = true;
	   while(i) {
		   
	       System.out.println("choose");
	       System.out.println("1)insert employee details");
	       System.out.println("2)exit");
		   switch(sc.nextInt()) {
		   case 1: System.out.println(" \n Enter Employee Informations \n");
		           System.out.println(" Enter Employee Name ");
		           sc.nextLine();
		           String empName = sc.nextLine();
		
		           System.out.println(" Enter Employee Id ");
		           int id = Integer.parseInt(sc.nextLine());
	               
	               
	               System.out.println(" Enter Employee Salary ");
		           int salary = Integer.parseInt(sc.nextLine());
		
		           System.out.println(" Enter designation");
		           String designation = sc.nextLine();
	    
		           Employee e = new Employee(id, empName, designation,salary);
		           emp.insertEmployee(e);
		          break;
		   case 2: i = false;
		          break;
		            }
	   
	              }
             }
  
   public void displayAllEmployee()
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = emp.getAllEmployees();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(" Name "+e.getEmpName());
		System.out.println(" ID "+e.getId());
		System.out.println(" Salary "+e.getSalary());
		System.out.println(" Designation:"+e.getDesignation());
		System.out.println("Scheme "+e.getScheme());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	public void sortedBySalaryList() {
		System.out.println("\n=========== Employees information sorted by salary ===========\n");
		List<Employee> empList = emp.lowToHighSalary();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
   
   public void salaryEmploye() {
	   List<Employee> empList = emp.getAllEmployees();
	   List<Employee> empSalList = new ArrayList<Employee>();
	   for (Employee e : empList) {
		   if(e.getSalary() == 20000) {
			   empSalList.add(e);
		   }
	   }
	   
	   salaryEmpMap.put(20000, empSalList);
	  
	   
   }
   
   
}
