package com.ksdc.traning.inheritance;

class A{
	public A() {
	}
	
	static {
		System.out.println("I am from class A");
	}
}

class B extends A{
	static{
		System.out.println("I am from class B");
	}
}
class C extends B{
	static{
		System.out.println("I am from class C");
	}
}

public class MultiLevelInheritance {
	
 public static void main(String[] args) {
	System.out.println("I am main method");
	 C obj=new C();
	

}
}
