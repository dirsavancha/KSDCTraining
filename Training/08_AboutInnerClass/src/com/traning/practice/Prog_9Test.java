// Anonymous with both Interface and a class
package com.training.practice;
interface Car{
	void engine();
}
class Dog{
	void eating(){
		System.out.println("Dog is eating");
	}
}

public class Prog_9Test{
	public static void main(String...abc){
		Dog d=new Dog(){
			void eating(){
				System.out.println("Dog is Annonymous eating");
			}
		
		};
		d.eating();
		Car c=new Car(){
			public void engine(){
				System.out.println("Car class engine");
			}
			
		};
		c.engine();
		
	}
}