package controlflow;
class Else{
	
	public void elseMethod(int marks){
		if(marks >=70 && marks <=100){
			System.out.println("I got Distinction");
		}
		else if(marks<70 && marks>=60){
			System.out.println("I got FirstClass");
		}
		else if(marks <60 && marks >=50){
			System.out.println("I got SecondClass");
		}
		else if(marks <=49 && marks >=1){
			System.out.println("I Failed");
		}
	}
}

public class ElseIf{
	public static void main(String...abc){
		Else obj=new Else();
		obj.elseMethod(55);
	}
}
	
	
	
