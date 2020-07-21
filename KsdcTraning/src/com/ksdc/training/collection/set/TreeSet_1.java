package com.ksdc.training.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_1 {
	public static void main(String[] args) {
		SortedSet<String> s1=new TreeSet<>();
		
		TreeSet<String> tree=new TreeSet<>();
		tree.add("abc");
		tree.add("abc");
		tree.add("acd");
		tree.add("xyz");
		tree.add("123");
		//tree.add(null);
		System.out.println(tree);
		
	}

}
Queue
