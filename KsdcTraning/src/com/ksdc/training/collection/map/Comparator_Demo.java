package com.ksdc.training.collection.map;

import java.util.ArrayList;
import java.util.Comparator;


class Student {
	String name;
	int id;
	public Student(String nameString,int id) {
		this.name=nameString;
		this.id=id;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
class SortByName implements Comparator<Object >{

	
	  
	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		return s1.name.compareTo(s2.name);
	}
	
}
class SortById implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if (s1.id > s2.id) {
			return +1;
		} else if (s1.id < s2.id) {
			return -1;
		} else {
			return 0;
		}

	}
	
}

public class Comparator_Demo {
	public static void main(String[] args) {
		Student obj1=new Student("Ram", 109);
		Student obj2=new Student("Tom", 108);
		Student obj3=new Student("Hari", 101);
		Student obj4=new Student("Raj", 102);
		ArrayList<Student> aList=new ArrayList<>();
		aList.add(obj1);
		aList.add(obj2);
		aList.add(obj3);
		aList.add(obj4);
		java.util.Collections.sort(aList,new SortByName());
		java.util.Collections.sort(aList,new SortById());
		System.out.println(aList);
	}

}
