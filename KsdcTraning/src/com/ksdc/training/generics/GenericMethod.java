package com.ksdc.training.generics;

class MyFirstGenericMethod{
	<T>void display(T [] arr) {
		for(T ele:arr) {
			System.out.println(ele);
		}
	}
}

public class GenericMethod {
  public static void main(String[] args) {
	Integer [] i1= {100,200,300};
	MyFirstGenericMethod obj1=new MyFirstGenericMethod();
	obj1.display(i1);
	
	String [] str= {"Ram","Hari","Bangalore"};
	obj1.display(str);
}
}
