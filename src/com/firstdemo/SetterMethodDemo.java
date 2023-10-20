package com.firstdemo;

public class SetterMethodDemo {
 public static void main(String[] args) {
	Abc ab=new Abc();
	ab.setId(1);
	ab.setName("abc");
	System.out.println("ab===="+ab);
}
}
class Abc{
	private int id;
	public String name;
	
	@Override
	public String toString() {
		return "Abc [id=" + id + ", name=" + name + "]";
	}

	public Abc(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	Abc(){
		
	}

	//public int getId() {
	//	return id;
	//}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}