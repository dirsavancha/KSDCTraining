package com.ksdc.traning.interfaces;

// We will not have any constructor
interface SuUniversity{
	void bsc(int a);
	void bca();
	default void bcom() {
		System.out.println("I am su bcom method");
	}
	static void mCom() {
		System.out.println("I am Mcom from suuniversity");
	}
	
}
interface Ksdc extends SuUniversity{
	void ba();
	
	default void bcom() {
		SuUniversity.super.bcom();
		System.out.println("I am ksdc bcom method");
		
	}
	
	
}

public class InterfaceParent_Child_Relationship implements Ksdc{

	@Override
	public void bsc(int a) {
		System.out.println("I am from class bsc method");
		
	}

	@Override
	public void bca() {
		System.out.println("I am from class bca method");
		
	}

	@Override
	public void ba() {
		System.out.println("I am from class ba method");
		
	}
	@Override
	public void bcom() {
		
		Ksdc.super.bcom();
		System.out.println("I am class Bcom method");
	}
	public static void main(String[] args) {
		InterfaceParent_Child_Relationship obj=new InterfaceParent_Child_Relationship();
		obj.ba();
		obj.bca();
		obj.bsc(100);
		obj.bcom();
		SuUniversity.mCom();
	}

}
