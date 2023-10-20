package com.secondemo;

public class PQR {
  public static void main(String[] args) {
	
}
}
class A {
	
	int a;//instance variable
    static int b;//static variable
    
    void m1() {
    	int c;//local variable
    	System.out.println("Inside instance method");
    	System.out.println("a=="+a);
    	System.out.println("b=="+b);
    }
    
    static void m2() {
    	A a1=new A();
    	System.out.println("a=="+a1.a);
    	System.out.println("b=="+b);
    	 System.out.println("Inside static method A ");
    }
    {
    	System.out.println("b=="+b);
       System.out.println("Inside instance block A");	
    }
    static{
    	A a1=new A();
    	System.out.println("a=="+a1.a);
    	System.out.println("b=="+b);
    	 System.out.println("Inside static block A");	
    }
	
}

class B {
	
	void m1() {
		A a1=new A();
		System.out.println("a==="+a1.a);
		System.out.println("a==="+a1.b);
		System.out.println("a==="+A.b);
		
	}
	
static void m2() {
	A a1=new A();
	System.out.println("a==="+a1.a);
	 System.out.println("Inside static method B ");
}
{
  System.out.println("Inside instance block B");	
}

static{
	System.out.println("Inside static block B");
}
	
}
