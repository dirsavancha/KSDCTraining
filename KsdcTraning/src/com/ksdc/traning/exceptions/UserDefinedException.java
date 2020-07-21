package com.ksdc.traning.exceptions;

import java.util.Scanner;

class StudentNotFoundException extends Exception{
	public StudentNotFoundException(String msg) {
		System.err.println(msg);
	}
}
class Student{
	String name;
	int id;
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return "Student[name="+name+",id="+id+"]";
	}
}
public class UserDefinedException {

	
	static void m1() throws StudentNotFoundException {
		Student s=new Student("Ram",101);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int id_Value=sc.nextInt();
		if(id_Value==s.getId()) {
			System.out.println(id_Value);
		}else {
			throw new StudentNotFoundException("Student details are not valid");
		}
		
		
	}
	public static void main(String[] args)throws StudentNotFoundException {
		m1();
	}
}
