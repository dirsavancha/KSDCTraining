package com.ksdc.traning.inheritance;

// Single level Inheritance
class Parent{  // parent class
	void m1() {
		System.out.println("I am Parent class Method");
	}
}


class Child extends Parent{ //child class
	void m2() {
		System.out.println("I am child class Method");
	}
	
}


public class Inheritance_Test {
	public static void main(String[] args) {
		Child ch=new Child();
		ch.m1();
		ch.m2();
		
		
	}

}
