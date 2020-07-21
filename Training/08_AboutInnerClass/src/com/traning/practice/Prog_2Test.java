// calling from another class

package com.training.practice;

class OuterClass{
	
	class InnerClass{
		void m1(){
			
			System.out.println("I am InnerClass Method");
		}
	}
}

public class Prog_2Test{
	
	public static void main(String...abc){
		
		new OuterClass().new InnerClass().m1();
	}
}