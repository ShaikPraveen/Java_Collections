package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Concept 
{
	
	public static void main(String[] args) {
		
		 
		 LinkedList<String> ll=new LinkedList<String>();
		 ll.add("SELENIUM");
		 ll.add("QTP");
		 ll.add("JMETER");
		 
		 System.out.println("Contents of the list "+ ll);
		 
		 //addfirst() Method
		 
          ll.addFirst("PRAVEEN");
          
          //addlast() Method
          
          ll.addLast("SHAIK");
		 
          System.out.println("Contents of the list  "+ll);
          
          //get() Method
          
          System.out.println(ll.get(0));//PRAVEEN
          
          //set() Method
          
          ll.set(0, "SHAIK");
          System.out.println(ll.get(0));//SHAIK
          
          //removeFirst() and removeLast() Method
          
          ll.removeFirst();
          ll.removeLast();System.out.println("Contents of the list  "+ll);
          
          
          //remove
          
         ll.remove(1);
         ll.removeLast();System.out.println("Contents of the list  "+ll);
          
          //How to Iterate or How to Print all Linked List values
          //1. Using For loop
          
            System.out.println("*******Using For Loop**********");
          
             for (int i = 0; i<ll.size(); i++) 
             {
            	 System.out.println(ll.get(i));//SELENIUM QTP JMETER
			}
          
          
          //2. Using advanced For loop
             
             System.out.println("**********------------**********");
             
             for(String str : ll)
             {
            	 System.out.println(str); //SELENIUM QTP JMETER
             }
             
             
          //3. Using Iterator
             
             System.out.println("^^^^^^^^^^^^^^Using Iterator-------");
             
                Iterator<String> it=ll.iterator();
                while (it.hasNext()) 
                {
                	System.out.println(it.next()); //SELENIUM QTP JMETER
					
				}
             
          //4.Using while loop
           
                  System.out.println("&&&&&&&&--Using While Loop---&&&&&&&&&");
                  
                  int num=0;
                  while (ll.size()>num) 
                  {
                	  System.out.println(ll.get(num)); //SELENIUM QTP JMETER
                	  num++;	
				}
                  
	}

}
