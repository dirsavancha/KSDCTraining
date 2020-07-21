package com.ksdc.traning.exceptions;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String... abc) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter value");
				int i = sc.nextInt();
				int j = 10 / i;
				System.out.println("j value is" + j);
				break;
				
			} /*catch (ArithmeticException  |InputMismatchException ime) {
				System.out.println("Enter non zero value and Integer value ");
			}*/catch(Exception e){
				System.out.println("Enter non zero value and Integer value ");
			}

		}

	}

}
