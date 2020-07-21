// Annonymous class with a class

package com.training.practice;
interface StarHotel {
	void drinking();
}
public class Prog_8Test{
	public static void main(String...abc){
		StarHotel obj1=new StarHotel(){
			public void drinking(){
				System.out.println("I am Having tea");
			}
		};
		obj1.drinking();
	}
}