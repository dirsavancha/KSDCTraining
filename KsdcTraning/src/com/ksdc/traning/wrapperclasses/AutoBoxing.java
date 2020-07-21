package com.ksdc.traning.wrapperclasses;

public class AutoBoxing {
	public static void main(String[] args) {
		
		
		//1.by using constructor
		//2.By using the methods
		
		Integer obj =new Integer(10);//---valueOf()
		System.out.println(obj);//10
		
		Integer obj1 =new Integer("100");//---parseInt()
		Integer obj2=new Integer("100");
		System.out.println(obj1==obj2);
		System.out.println(obj1);//100
		
		System.out.println("=====");
		Integer i1=Integer.valueOf(10);
		Integer i2=Integer.valueOf("100");
		Integer i3=Integer.valueOf("100");
		System.out.println(i2==i3);
		System.out.println(i1+"-"+i2);
		
		
		int i5=new Integer((int) 100);
		
		
	}
	
	

}
