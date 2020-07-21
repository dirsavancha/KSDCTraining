package com.ksdc.training.collection.map;

import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable<Employee> {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Employee e) {
		int j = e.id;
		int i = this.id;
		System.out.println("I value is"+i+"  "+"J value"+j);
		if (i > j) {
			return +1;
		} else if (i < j) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}

public class ComparableDemo {
	public static void main(String[] args) {
		Employee e1=new Employee("Tom", 107);
		Employee e2=new Employee("John", 105);
		Employee e3=new Employee("Raj", 101);
		Employee e4=new Employee("Hari", 102);
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Collections.sort(list);
		System.out.println(list);
	}

}
