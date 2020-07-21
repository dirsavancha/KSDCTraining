package com.ksdc.traning.exceptions;


public class Ex_3 {
	void division(){
		try{
		System.out.println("I am before i value ");
		int i=10;
		System.out.println("I am After i value and before J value ");
		
		int j=i/0;// exception---
		System.out.println("I am After J value ");
		}catch(ArithmeticException ae){
			System.out.println(ae);
			
		}
		System.out.println("Completed");
	}
	public static void main(String...abc) {
		Ex_3 obj=new Ex_3();
		obj.division();
	}
	
	
	

}


