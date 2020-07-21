package com.ksdc.training.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_1 {
	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(100);
		lhs.add(null);
		lhs.add(200);
		lhs.add(100);
		lhs.add(null);
		System.out.println(lhs);

	}

}


