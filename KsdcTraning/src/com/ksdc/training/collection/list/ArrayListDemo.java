package com.ksdc.training.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

import com.sun.xml.internal.ws.api.addressing.NonAnonymousResponseProcessor;

public class ArrayListDemo {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Chikoo");
		fruits.add("Mango");
		fruits.add(null);
		
		System.out.println(fruits.get(1));
		
		fruits.add(1, "Bananna");
		System.out.println(fruits.get(1));
		
		System.out.println("After banana");
		
		System.out.println(fruits.set(1, "Guava"));
		System.out.println(fruits.get(1));
		
		
		
		System.out.println("================");
		ArrayList <String> veg=new ArrayList<>();
		
       veg.add("carrot");
       veg.add("brinjal");
       veg.addAll(fruits);
       System.out.println(veg);
       

	}

}
