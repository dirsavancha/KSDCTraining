// Annonymous class with a class

package com.training.practice;

class Hotel{
	void eating(){
		System.out.println("I am having lunch");
	}
}

public class Prog_7Test{
	public static void main(String...abc){
		Hotel h=new Hotel(){
			void eating(){
				System.out.println("I am having dinner");
				super.eating();
			}
		};// Annonymous
		h.eating();
		Hotel h1=new Hotel(){
			void eating(){
				System.out.println("I am having Tea");
				super.eating();
			}
		};  // Annonymous
		h1.eating();
		System.out.println(h.getClass().getName());
	System.out.println(h1.getClass().getName());
	}
	
}