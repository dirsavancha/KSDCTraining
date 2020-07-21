package com.traning.practice;

public class LemonTea extends Tea{
	public LemonTea(String teaType){
		super(teaType);
	}
	@Override
	public void teaPrice(){
		System.out.println("Lemon Tea Price is : 40/-");
	}
}