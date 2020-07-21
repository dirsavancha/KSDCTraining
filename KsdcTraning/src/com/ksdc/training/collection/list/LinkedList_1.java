package com.ksdc.training.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_1 {
	public static void main(String[] args) {
		
		List<String> place=new LinkedList<>();
		
		
		LinkedList<String >placeName=new LinkedList<>();
		
		placeName.add("Hyderabad");
		placeName.add("Chennai");
		placeName.addFirst("Bangalore");
		System.out.println(placeName);
		System.out.println(placeName.poll());
		System.out.println(placeName);
		
		
	}
	

}
