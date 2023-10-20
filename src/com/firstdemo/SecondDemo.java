package com.firstdemo;

public class SecondDemo {
     public static void main(String[] args) {
		
    	   Student s1=new Student(1,"aa",10);
    	   System.out.println("s1==="+s1);
    	   
    	   Student s2=new Student(2,"aaa",20);
    	   System.out.println("s2==="+s2);
    	   
    	   
	}
}
 class Student {
	int studentId;
	String sname;
	int mark;
	
	public Student() {
		System.out.println("Inside no arg");
	}
	
	public Student(int a) {
		System.out.println("single para contrcutor");
	}

	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sname=" + sname + ", mark=" + mark + "]";
	}

	public Student(int studentId, String sname, int mark) {
		//super();
		this.studentId = studentId;
		this.sname = sname;
		this.mark = mark;
	}
	
	{
		System.out.println("Inside instance block");
	}
	
	static{
		System.out.println("Inside static block");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	
}
  class A {
	
}
