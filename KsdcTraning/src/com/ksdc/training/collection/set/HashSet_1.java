package com.ksdc.training.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSet_1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add(null);
		list.add("First");
		list.add("Second");
		list.add(null);
		list.add("First");
		
		System.out.println(list);
		
		
		Set<String> s1=new HashSet<>(list);
		System.out.println(s1);
		
		
		HashSet<String > s2=new HashSet<>();
		
		s2.add("hyderabad");
		s2.add(null);
		s2.add("bangalore");
		s2.add("hyderabad");
		s2.add(null);
		
		
		System.out.println(s2);
		
		
			System.out.println(s2.contains("bangalore"));
			System.out.println("Set Size is"+s2.size());
			System.out.println("Is empty  "+s2.isEmpty());
			System.out.println("Remove :"+s2.remove("bangalore"));
			System.out.println(s2);
			s2.clear();
			System.out.println("Is empty  "+s2.isEmpty());
			System.out.println(s2);
			
			
	}

}
