package com.ksdc.training.generics;

interface Animal<T>{
	 void categoryOfAnimal(T animal);
}
class AnyTypeOfAnimal<T> implements Animal<T>{
	@Override
	public void categoryOfAnimal(T animal) {
     		String animalName=animal.getClass().getName();
     		if(animalName.endsWith("Lion")) {
     			System.out.println("It is a wild animal");
     		}else if(animalName.endsWith("Dog")) {
     			System.out.println("It is pet animal");
     		}
	}
}
class Dog{
	
}
class Lion{
	
}

public class GenericInterface<T> {
 public static void main(String[] args) {
	Dog d=new Dog();
	Lion l=new Lion();
	AnyTypeOfAnimal<Dog> obj=new AnyTypeOfAnimal<>();
	AnyTypeOfAnimal<Lion> obj1=new AnyTypeOfAnimal<>();
	obj.categoryOfAnimal(d);
	obj1.categoryOfAnimal(l);
}
}
