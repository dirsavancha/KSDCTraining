package com.ksdc.traning.usecase.Tea;

public class GingerTea extends Tea{
	public GingerTea(String teaType){
		super(teaType);
	}
	
	public void teaPrice(){
		System.out.println("Lemon Tea Price is : 60/-");
	}
}
