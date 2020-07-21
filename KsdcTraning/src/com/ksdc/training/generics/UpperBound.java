package com.ksdc.training.generics;

import java.util.List;

class Upper<T extends Number>{
	
	  T t;
	  public T getT()
	  {
		  return this.t;
	  }
	
}
public class UpperBound {
  public static void main(String[] args) {
	  Upper<Number> objUpper=new Upper<>();
	  System.out.println(objUpper.t=101.0f);
	 // objUpper.t="Hello";
	 // objUpper.t=new Object();
	  objUpper.t=100;
	  objUpper.t=502.00;
	  
    	  
             	  
	 
	 
}
}


