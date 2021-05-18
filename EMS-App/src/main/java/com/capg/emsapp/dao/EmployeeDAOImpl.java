package com.capg.emsapp.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.customDB.EmployeeDB;
/*
 * DAO :- Data Access Object
 * Includes all business logic related to database 
 * 
 * */


public class EmployeeDAOImpl implements IEmployeeDAO,Comparator<Employee> {

	List<Employee> empList = EmployeeDB.empList; // code will be replaced with database connection code
	
	
	public boolean insertEmployee(Employee e) {
		
		// replace code with insert query
		boolean isEmpInserted = EmployeeDB.addEmployee(e);
		
		// update database
		empList = EmployeeDB.empList;
		
		return isEmpInserted;
	}

	public List<Employee> getAllEmployees() {
		
		return empList;  // select * from Employee
	}

	public List<Employee> getAllEmployeesBySalary(int range1,int range2) {
		
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.clear();	
		
		for (Employee employee : empList) {
			
			if(employee.getSalary()>=range1 && employee.getSalary() <= range2)
			{
				tempList.add(employee);
			}
			
		}
		
		return tempList;
	}

	public Employee getEmployeeById(int id) {
		
		
		for (Employee employee : empList) {
			if(employee.getId() == id)
			{
				return employee;
			}
		}
		return null;
	}
	
   public List<Employee> lowToHighSalary() {
	   Collections.sort(empList,new EmployeeDAOImpl());
	   return empList;
   }
 
   public int compare(Employee e1, Employee e2) {
	   return e1.getSalary()-e2.getSalary();
   }
   
   public Employee getEmpByHighestexperience() {
	   int years = 0;
	   Employee name = null;
	   for (Employee employee : empList) {
			if(employee.getExperience() > years) {
				  years = employee.getExperience();
				  name = employee;
			}
		}
	   return name;
   }
 
}