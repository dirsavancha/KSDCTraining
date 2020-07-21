
  // Non primitive
 package com.training.practice;
 
 class Fruit{
	 void fruitMethod(){
		 System.out.println("I am fruit class");
	 }
	 
 }
 class Citrus extends Fruit {
	 void citrusMethod(){
		 System.out.println("I am Citrus class");
	 }
	  
 }
 class Lemon extends Citrus{
	 void lemonMethod(){
		 System.out.println("I am Lemon class");
	 }
	  
 }
 
 public class NonPrimitiveCasting{
	 public static void main(String...abc){
		 Fruit f=new Fruit();
		 f.fruitMethod();
		// f.citrusMethod();
		 //f.lemonMethod();
		 
		 Fruit f2=new Citrus();
		 f2.fruitMethod();
		// f2.citrusMethod();
		 //f2.lemonMethod();
		
		//Citrus c1=(Citrus)new Fruit();   
		//c1.fruitMethod();
		//c1.citrusMethod();
		
		Lemon l=new Lemon();
		l.fruitMethod();
		l.citrusMethod();
		l.lemonMethod();
		
		
	 }
 }
  
  