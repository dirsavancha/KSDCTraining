package com.ksdc.traning.exceptions;

public class Ex_2 {

	void grandFather() {
		System.out.println("calling grandson to give money");
		father();
	}

	void father() {
		son();
	}

	void son() {
		System.out.println(100 / 0);// exception
	}

	public static void main(String[] args) {
		Ex_2 obj = new Ex_2();
		obj.grandFather();
	}

}
