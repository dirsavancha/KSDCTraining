package com.ksdc.training.generics;

import java.util.ArrayList;
import java.util.List;

class Lower{
	public static void display1(List < ? super Number> list) {
		System.out.println(list);
		
	}
}

public class LowerBound {
	
  public static void main(String[] args) {
	List<String> li=  new ArrayList<>();
	li.add("500");
	li.add("200");
	Lower.display1(li);
	
}
}
