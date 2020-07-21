package com.ksdc.traning.inheritance;

public class Employee extends Person {

	float sal;
	String jobType;
	
	public void showEmployee() {
		System.out.println("Employee class:"+"Name :"+name+"\t"+"id :"+id+"\t"+"Salaray :"+sal+"\t"+"Job Type :"+"\t"+jobType);
	}
}
