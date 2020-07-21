package com.traning.practice;
public class GingerTea extends tea{
	
	public GingerTea(String teaType){
		super(teaType);
	}
	@Override
	public void teaPrice(){
		System.out.println("Lemon Tea Price is : 60/-");
	}
}