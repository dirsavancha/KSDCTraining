package com.ksdc.traning.wrapperclasses;

public class UnBoxing {
	public static void main(String[] args) {
		Integer obj=new Integer(10);
		int i=obj.intValue();
		
		System.out.println(obj);
		System.out.println(i);
		System.out.println(obj==i);
		
		int i1=Integer.parseInt("100");
		System.out.println(i1);
	}

}
