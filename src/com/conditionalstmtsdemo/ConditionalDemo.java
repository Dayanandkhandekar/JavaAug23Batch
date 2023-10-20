package com.conditionalstmtsdemo;

public class ConditionalDemo {
  public static void main(String[] args) {
	  ConditionalPractice p1=new ConditionalPractice();
	  ConditionalPractice.ifDemo();
   }
}
class ConditionalPractice{
	
	static void ifDemo() {
		int age=19;
		 
		if(age > 18) {
			System.out.println("Ur eligible for voting");
		} 
		
		System.out.println("===EOP==");
	}
	
}
