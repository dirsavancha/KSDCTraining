// Method Inner class

package com.training.practice;

class Outer{
	 String name="Ram";
	 static int i=100;
	 private static int j=200;
	 void outerMethod(){
		 final String name="Hari";
	 final static int k=1;
	//final private static int l=2;
		 class Inner{
			 void InnerMethod(){
			 System.out.println(name);
			 System.out.println(i);
			 System.out.println(j);
			 }
			 
		 }
		 Inner obj1=new Inner();
	    obj1.InnerMethod();
	 }
	 
	
}

public class Prog_6Test{
	public static void main(String...abc){
		Outer obj=new Outer();
		obj.outerMethod();
	}
}
	
	
