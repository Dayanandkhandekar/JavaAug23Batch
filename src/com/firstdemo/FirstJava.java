package com.firstdemo;

public class FirstJava {
	public static void main(String[] args) {
		System.out.println("Welcome in First JAVA PGM1");
		System.out.println("Welcome in First JAVA PGM2");
		System.out.println("Welcome in First JAVA PG3");
	}
	
  //what is mean by class
	//Collection of data members such as variables,methods, and blocks
   // It is the user defined structure

	int a=10;// instance
	static int b=10; // static variable
	// int -- datatype  a-- variable name   10 --- value
	
	// variable -- name given to memory location
	// Types of variable
	// 1. Instance variable-- Those variable declared inside the class but outside the methods and blocks without
	// static keyword
	//2. Static variable --Those variable declared inside the class but outside the methods and blocks with static keyword
	//3.Local Variable
	
	// Methods or block --  business logic write krnyasati
	// synatx :
	  //   datatype/returntype  methodname ()
	 //      {
	         // method body 
	        // here u can write ur business logic

	   //   }
	
	  void m1() { // instance  method
		  int d;// local variable
		  System.out.println("welcome in java");
	  }
	  
	  int m2() { // instance  method
		  
		  return 40;
		  
		  
	  }
	  
	 static  char m3() {// static  method
		  return 'd';
	  }
	  
	 static String m4() {// static  method
		   
		  return "hjkigft";
	  }
	  
	  
	 {
		 int e;// local variable
		System.out.println("Inside Instance block"); 
	 }
	 
	 static{
		 System.out.println("Inside Static block");
	 }
	
}
