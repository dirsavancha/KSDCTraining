package com.traning.practice;
abstract public class Tea{
	String typeOfTea;
	
	public Tea(String typeOfTea){
		this.typeOfTea=typeOfTea;
	}
	public abstract void teaPrice();
}