package com.ksdc.traning.exceptions;

public class ThrowKeyword extends Throwable{
	public static void main(String[] args) throws ThrowKeyword  {
		System.out.println("Abc");
		throw new ThrowKeyword();
		
		
	}

}
