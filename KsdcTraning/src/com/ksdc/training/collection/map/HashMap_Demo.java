package com.ksdc.training.collection.map;

import java.util.HashMap;
import java.util.Map;

public interface HashMap_Demo {
	public static void main(String[] args) {
		//Map<Integer, String> mp=new HashMap<Integer, String>();
		
		HashMap<Integer,String> mp1=new HashMap<>();
		mp1.put(100,"tom");
		mp1.put(101,"john");
		mp1.put(100,"Ram");
		mp1.put(102,"Raj");
		mp1.put(null,null);
		System.out.println(mp1);
		System.out.println(mp1.get(102));
		
		System.out.println(mp1.entrySet());
		System.out.println(mp1.size());
		System.out.println(mp1.keySet());
		System.out.println(mp1.values());
	
		
	}

}
