// Demo On Inner Class
package com.training.practice;

class Outer{
	class Inner{
		void m1(){
			System.out.println("I am Inner Class");
		}
		
	}
	public static void main(String...abc){
		Outer o=new Outer();
		Outer.Inner oi=o.new Inner();
		oi.m1();
		
		Outer.Inner i=new Outer().new Inner();
		i.m1();
		
		new Outer().new Inner().m1();//---- Descriptive way
			
	}
}







