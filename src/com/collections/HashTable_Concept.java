package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable_Concept 
{
	
	public static void main(String[] args) {
		
		
		
		Hashtable h1=new Hashtable();
		
		 h1.put(10, "PRAVEEN");
		 h1.put(20, "SELENIUM");
		 h1.put(30, "TESTING");
		 
		//Create a clone Copy / Shallow Copy
		 
		 Hashtable h2=new Hashtable();
		 
		   h2= (Hashtable)h1.clone();
		   
		   System.out.println("The Values of h1 "+ h1);
		   System.out.println("The values of h2 "+h2);
		  
		   h1.clear();
		   
		   System.out.println("The Values of h1 "+ h1); //h1 values are removed why because it is duplicate
		   System.out.println("The values of h2 "+h2);
		   
		   
		   //contains()  value Method:
		   
		   Hashtable h3=new Hashtable();
		   
		   h3.put("A", "DEVELOPMENT");
		   h3.put("B", "SALES");
		   h3.put("C", "ACCOUNTING");
		   
		   if (h3.containsValue("SALES")) 
		   {
			   System.out.println("Value is Found");
			
		}
		   
		   //Print all the values from HashTable using --Enumeration --elements()
		   Enumeration e=h3.elements();
		   System.out.println("Print Values from h3");
		   
		   while (e.hasMoreElements()) 
		   {
			   System.out.println(e.nextElement());	
		}
		   
		   //get all the values from Hashtable using  --entrySet()---set of HashTable values
		   
		   System.out.println("Print values from h3 using entry set");
		   Set s=h3.entrySet();
		   System.out.println(s);
		   
		   
		   //equals()
		   //Check both HashTables are equal or not
          Hashtable h4=new Hashtable();
		   
		   h4.put("A", "DEVELOPMENT");
		   h4.put("B", "SALES");
		   h4.put("C", "ACCOUNTING");
		   
		  // h4.put(null, "ACCOUNTING");//Gives an Error
		  // h4.put("H", null);//Gives an Error
		   
		   System.out.println("Values from h4::");
		   System.out.println(h4);
		   
		   if (h3.equals(h4)) 
		   {
			System.out.println("Both are Equal");
		}
		   
		//get the value from a key
		   System.out.println(h4.get("A"));//development
		   
	  //get the hashcode of hashtable object
		   System.out.println("Hash code of Hashtable Object is " +h4.hashCode());
		   
		   
	   Hashtable<String, String> h6=new Hashtable<String,String>();  
		   
		   
		   
		   
	}

}
