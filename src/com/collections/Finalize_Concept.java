package com.collections;

public class Finalize_Concept 
{
	
	//finalize() is a method
	
   public void finalize()
   {
	   System.out.println("finalize method");
   }
   
   
   public static void main(String[] args) {
	Finalize_Concept f1=new Finalize_Concept();
	Finalize_Concept f2=new Finalize_Concept();
	
	
	f1=null;
	f2=null;
	
	  System.gc(); // we will the garbage collector using this gc() method     
}
}
