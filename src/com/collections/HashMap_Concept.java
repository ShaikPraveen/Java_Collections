package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_Concept 
{
	public static void main(String[] args)
	{
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1, "SELENIUM");
		hm.put(2, "AUTOMATION");
		hm.put(3, "MANUAL");
		hm.put(4, "TESTING");
		
		System.out.println(hm.get(1));//SELENIUM
		System.out.println(hm.get(2));//AUTOMATION
		System.out.println(hm.get(3));//MANUAL
		
		System.out.println(hm.get(5));//null -> It will returns null value
		
		//How to print all the values of HashMap
		
		for (Entry m : hm.entrySet()) 
		{
			System.out.println(m.getKey() +" "+ m.getValue());
			
		}
		 //Here Entry is an method for reference of m
		//entrySet() is method to store all the HashMap values
		
		System.out.println(hm);
	
	  //1. remove() method
		hm.remove(3);
		System.out.println(hm);
		
		
		
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee("Name", 10, "TESTING");
		Employee e2=new Employee("Name", 20, "DEVELOPING");
		Employee e3=new Employee("Name", 30, "SALES");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the HashMap
		
		for(Entry<Integer,Employee> m: emp.entrySet())
		{
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println("EMPLOYEE "+key+" INFO");
			System.out.println(e.name+" "+e.age+"  "+e.dept);
		}
	}

}
