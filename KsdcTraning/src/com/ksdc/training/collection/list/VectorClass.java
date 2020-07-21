package com.ksdc.training.collection.list;

import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector<String> animal=new Vector<>();
		animal.add("1");
		animal.add("2");
		animal.add("3");
		animal.add("4");
		animal.add("5");
		animal.add("6");
		animal.add("7");
		animal.add("8");
		animal.add("9");
		animal.add("10");
		animal.add("11");
		animal.add("11");
		
		System.out.println(animal.firstElement());
		System.out.println(animal.size());
		System.out.println(animal.capacity());
		System.out.println(animal.firstElement());
	}

}
