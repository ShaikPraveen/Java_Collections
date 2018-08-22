package com.collections;

public class Finally_Concept
{
	public static void main(String[] args) {
		//test1();
		//test2();
		division();
	}
	
	  //finally : finally keyword is used to association between two try and catch blocks. finally keyword is always used with try and catch blocks
	  //finally code will execute after the try catch block
	
	 public static void test1() 
	 {
		try
		{
			System.out.println("Inside test1 Method");
			throw new RuntimeException("test1");
		} catch (Exception e)
		{
			System.out.println("Inside catch Block");
		}
		
		finally 
		{
			System.out.println("Inside finally block");
		}
		 
	 }
	 
	 
	 public static void test2() 
	 {
		 try 
		 {
			 System.out.println("Inside test2 Method");
		 } finally 
		 {
			 System.out.println("finally code in test2 method");
		 }
	 }
	 
	 
	 public static void division()
	 {
		 int i=0;
		 
		 try 
		 {
			 System.out.println("Indise try block");
			 int k=i/0; // ArithematicException
			  
		 }catch (ArithmeticException e)// here you will give catch (NullPointerException e) and excute the code, it will gives  an error in catch block section
		 {
			System.out.println("Inside catch block");
			System.out.println("Divided by zero Error");
		}
		 
		finally 
		{
			System.out.println("Execute this code even after any exception");
		}
	 }
	 
	 
	 
	 
	 
}
