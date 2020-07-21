package com.ksdc.traning.polymorphysim;

public class Demo_Poly {

	
	
	
	void add(byte a) {
		System.out.println("I am byte "+a );
	}
	
	void add(short a) {
		System.out.println("I am short "+a );
	}
	
	
	

	
	
	
	public static void main(String[] args) {
		Demo_Poly obj=new Demo_Poly();
		
		
		obj.add(1);
	}
	

}
