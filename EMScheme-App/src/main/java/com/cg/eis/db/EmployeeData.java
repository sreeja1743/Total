package com.cg.eis.db;


import com.cg.eis.bean.*;
import java.util.*;

public class EmployeeData {
	
	public static HashMap<String,Employee> map = new HashMap<String,Employee>();
	
	public static void addEmployee(Employee e, String id)
	{
	    map.put(id, e);	
	}
	
	
	
	
	
	
	
	
	
}
