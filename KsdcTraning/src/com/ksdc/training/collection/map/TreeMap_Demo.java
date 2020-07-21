package com.ksdc.training.collection.map;

import java.util.TreeMap;

public class TreeMap_Demo {
	public static void main(String[] args) {
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(1,"tiger");
		treeMap.put(3,"lion");
		treeMap.put(2,"abc");
		treeMap.put(4,"xyz");
		System.out.println(treeMap);
	}

}
