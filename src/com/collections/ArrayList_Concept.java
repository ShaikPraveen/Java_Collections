package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Concept 
{
	
	public static <E> void main(String[] args) {
		
		ArrayList ar=new ArrayList(); //This is non-generic
		         ar.add(10);//0
		         ar.add(20);//1
		         ar.add(30);//2
		         
		         System.out.println(ar.size());
		         
		         ar.add(40);//3
		         ar.add(50);//4
		         ar.add(20);//5
		         
		         
		         System.out.println(ar.size());// size of ArrayList
		         
		         System.out.println(ar.get(3));//40 get the value from the index
		         
		         
	  // To Print all values from ArrayList :: 1.  using for loop and 2. Using Iterator
		      
		       // For loop
		         for (int i = 0; i < ar.size(); i++)
		         {
				      System.out.println(ar.get(i));
				}
		         
		         
	  //Generic vs non-generics 
		         
	  //non generic means here warning shows us yelloe color, to remove this we use generics
		         
		   ArrayList<Integer> ar1=new ArrayList<Integer>();
		   ar1.add(10);
		  //ar.add("praveen"); -> Throws an Exception
		   
		  ArrayList<String> ar2=new ArrayList<>();
		  ar2.add("Praveen");
		  
		  ArrayList<E> ar3=new ArrayList<E>();
		 
		  
	//Sometime in ArrayList we can store different class objects also
    //How to define User defined Class objects Arraylist
		  
		//Employee class objects
		  
		  Employee e1=new Employee("PRAVEEN",20,"QA");
		  Employee e2=new Employee("GOPI",30,"DEVT");
		  Employee e3=new Employee("SULEMAN",40,"MARKETING");
		  
		  //Create ArrayList
		  
		  ArrayList<Employee> ar4=new ArrayList<Employee>();
		  ar4.add(e1);
		  ar4.add(e2);
		  ar4.add(e3);
		  
		  
		 //Iterator to traverse the values
		  
		  Iterator<Employee> at=ar4.iterator();
		  while (at.hasNext()) 
		  {
			 Employee emp= at.next();
			 System.out.println(emp.name);
			 System.out.println(emp.age);
			 System.out.println(emp.dept);	
		}
		  
		  System.out.println("&&&&&&&&&&&&&&------------$$$$$$$$$");
		  
		  //addAll() Method -> To merge two ArrayLists
		  
		  
		  ArrayList<String> ar5=new ArrayList<String>();
		  ar5.add("Praveen");
		  ar5.add("Automation");
		  ar5.add("Manual");
		  
		  
		  ArrayList<String> ar6=new ArrayList<String>();
		  ar6.add("Gopi");
		  ar6.add("Automation");
		  ar6.add("Testing");
		  
		  ar5.addAll(ar6);
		  
		  for (int i = 0; i<ar5.size(); i++)
		  {
			  System.out.println(ar5.get(i));
			
		}
		  
		  System.out.println("@@@@@@@@@@@-------------##########");
		  
		 //removeAll() Method
		  
		  ar5.removeAll(ar6);
		  
		  for (int i = 0; i < ar5.size(); i++)
		  {
			  System.out.println(ar5.get(i));
			
		}
		  
		  System.out.println("&&&&&&&&&&----------------^^^^^^^^");
		  
		 //retainAll() -> It will display common name like here Automation is Common, out put is Automation
		  
		  ArrayList<String> ar7=new ArrayList<String>();
		  ar7.add("Praveen");
		  ar7.add("Automation");
		  ar7.add("Manual");
		  
		  
		  ArrayList<String> ar8=new ArrayList<String>();
		  ar8.add("Gopi");
		  ar8.add("Automation");
		  ar8.add("Testing");
		  
		  ar7.retainAll(ar8);
		  
		  
		  for (int i = 0; i < ar5.size(); i++)
		  {
			  System.out.println(ar5.get(i));
			
		}
	}

}
