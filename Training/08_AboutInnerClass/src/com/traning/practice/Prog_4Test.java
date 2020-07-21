//

package com.training.practice;

class OuterClass{
	 String name1="Ram";
	 static String name2="Hari";
     class InnerClass{
		 String name1="Shyam";// non stat inner
		 String name2="Royal";
		 void display(){
			 String name1="Hyderabad";// local var
			 String name2="Bangalore";
			 System.out.println(name1);
			 System.out.println("2nd way name1 "+this.name1);
			 System.out.println("2nd way name "+OuterClass.this.name1);
			 System.out.println(name2);//Bangalore
			 System.out.println("2nd way name2 "+this.name2);//Royal
			 System.out.println("2nd way name "+OuterClass.this.name2);//Hari
		 }
		 
	 
	 }
}

public class Prog_4Test{
	public static void main(String...abc){
		new OuterClass().new InnerClass().display();
	}
}