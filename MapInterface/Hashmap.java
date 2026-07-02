package MapInterface;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	/*	Requirement
		1.A company wants to store employee details using a Map. Each employee has a unique Employee ID and Employee Name.

		Tasks
		Create a HashMap to store employee details.

		2.Add the following employee records:

		101 → Rahul

		102 → Priya

		103 → Aniket

		104 → Sneha

		3.Display all employee records.

		4.Retrieve the employee with ID 102.

		5.Check whether Employee ID 103 exists.

		6.Check whether employee name "Sneha" exists.

		7.Display the total number of employees.

		8.Remove employee ID 104.

		9.Display all remaining employees.*/
		
		
		/*Tasks
		1.Create a HashMap to store employee details.*/	
		Map<Integer, String> Employees=new HashMap<Integer, String>();
		
		
		
		/*2.Add the following employee records:

			101 → Rahul

			102 → Priya

			103 → Aniket

			104 → Sneha*/
		
		Employees.put(101, "Rahul");
		Employees.put(102, "Priya");
		Employees.put(103, "Aniket");
		Employees.put(104, "Sneha");
		
		
		//3.Display all employee records.
		
		System.out.println("Employees Records : "+Employees);
		
		//4.Retrieve the employee with ID 102.
		System.out.println("Get Employee name  ID 102 : "+Employees.get(102));
		
		
		//5.Check whether Employee ID 103 exists.
		System.out.println("Check Employee 103 ID is Exits: "+Employees.containsKey(103));
		
		
		//6.Check whether employee name "Sneha" exists.
		System.out.println("Check Employee name Sneha Exist : "+Employees.containsValue("Sneha"));
		
		
		//7.Display the total number of employees.
		System.out.println("Total Number of Employees : "+Employees.size());
		
		//8.Remove employee ID 104.
		System.out.println("Remove EmpId 104: "+Employees.remove(104));
		
		System.out.println("After Remove Empy : "+Employees);
		
		
		//9.Display all remaining employees.*/
		
		
		for(Map.Entry<Integer, String>entry:Employees.entrySet())
		{
			
			System.out.println("Employee Empid and Empname : "+entry.getKey()+" "+entry.getValue());
			
		}
		
		//Delete Employees Records From Map
		     Employees.clear();
		     
		     
		     
		     
		     System.out.println("After Delete Map : "+Employees.isEmpty());
		
		//*  for(String  a:data)
		  {
			  
			  System.out.println(a);
		  }//*
		

	}

}
