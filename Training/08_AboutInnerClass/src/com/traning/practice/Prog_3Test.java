// 

package com.training.practice;

class OuterClass{
     void m1(){
		 InnerClass ic=new InnerClass();
		 ic.m1();
		 System.out.println("I am OuterClass method");
	 }
    class InnerClass{
		void m1(){
			
			System.out.println("I am InnerClass method");
		}
		
	}
}

public class Prog_3Test{
	
	public static void main(String...abc){
		//new OuterClass().new InnerClass().m1();
		OuterClass o=new OuterClass();
		o.m1();
	}
}