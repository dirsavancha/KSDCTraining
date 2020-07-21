package com.ksdc.traning.interfaces;

interface Rbi {

	public abstract void loan();

	public abstract void insurance();

	default void healthcare() {
		System.out.println("I am Rbi Interface");
	}
	static void carLoan() {
		System.out.println("I am static method from RBI");
	}
}


class sbi implements Rbi {
	@Override
	public void loan() {

		System.out.println("I am sbi loan section");
	}

	@Override
	public void insurance() {

		System.out.println("I am sbi insurance");
	}

	@Override
	public void healthcare() {
  System.out.println("I am Sbi healthcare");
		
	}
	
	

}

public class DefaultMethods extends sbi {

	public static void main(String... abc) {
		DefaultMethods obj = new DefaultMethods();
		obj.loan();
		obj.insurance();
		obj.healthcare();
		

	}

}
