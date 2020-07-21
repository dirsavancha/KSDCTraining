package com.ksdc.training.generics;

import sun.applet.Main;

class MyFirstGenericClass<T, E> {
	T name;
	E id;

	public MyFirstGenericClass(T name, E id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name is " + name + "Id is " + id;
	}

}

public class GenericClass {
	public static void main(String[] args) {
		MyFirstGenericClass<String ,Integer> obj=new MyFirstGenericClass<>("Ram", 101);
		MyFirstGenericClass<Integer,String> obj1=new MyFirstGenericClass<>(102,"Hari");
		System.out.println(obj1);
	}

}
