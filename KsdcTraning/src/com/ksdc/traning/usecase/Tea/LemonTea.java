package com.ksdc.traning.usecase.Tea;

public class LemonTea extends Tea{
	public LemonTea(String teaType){
		super(teaType);
	}
	
	public void teaPrice(){
		System.out.println("Lemon Tea Price is : 40/-");
	}
}
