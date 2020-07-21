//Classes Inside Outer class

package com.training.practice;

class Outer{     // outer class
	  
	class Outer_Inner{  //  Inner class
		void m2(){
			
			
		  System.out.println("I am Outer_Inner class method");
		   
		 
	  }
		class Inner_1{    // class Inside Inner class 
			void m1(){
				
		  System.out.println("I am  class Inner_1  method");
		  Outer_Inner.this.m2();
		  
		 
		
	  }
		}
	}
}

public class Prog_5Test{
	public static void main(String...abc){
		new Outer().new Outer_Inner().new Inner_1().m1();
	}
}
