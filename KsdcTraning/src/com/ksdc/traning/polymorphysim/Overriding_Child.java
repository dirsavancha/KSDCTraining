package com.ksdc.traning.polymorphysim;



public class Overriding_Child extends Overriding_Parent {
	void house() {
		//super.house();
		System.out.println("I am child class house");
	}
	
	void bike() {
		System.out.println("I am child class bike");
	}
   public static void main(String[] args) {
	
	
	Overriding_Parent p=new Overriding_Parent();
	p.house();
	p.car();
	
	System.out.println("==================");
	
	Overriding_Child c=new Overriding_Child();
	c.house();
	c.car();
	c.bike();
	
	System.out.println("==================");
	
	Overriding_Parent p1=new Overriding_Child();  //upcasting
	p1.house();// Runtime polymormorphism
	p1.car();
	//p1.bike();
	System.out.println("==================");
	
	Overriding_Child ch=(Overriding_Child )p1;// Downcasting
	ch.house();
	ch.car();
	ch.bike();
	

	
	
	
	
	
	
	
	
}
}
