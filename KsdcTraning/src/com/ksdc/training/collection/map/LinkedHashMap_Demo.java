package com.ksdc.training.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1,"Mango");
		lhm.put(2,"apple");
		lhm.put(3,"chikoo");
		lhm.put(null,"bannana");
		System.out.println(lhm);
	}

}
