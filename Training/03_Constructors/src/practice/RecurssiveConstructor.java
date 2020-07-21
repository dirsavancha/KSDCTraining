// Recurssive Constructor Invocation

package practice;



class Recurssive {
	String name;
	int id;
	float sal;
	
	Recurssive( int id){
		this("Ram");
		this.id=id;
		
	}
	Recurssive( String name){
		this(5000.f);
		this.name=name;
	}
	Recurssive( float c){
		this(20);
		this.sal=c;
	}
	
	void display(){
		System.out.println("Name "+name+"\t"+" id is "+id+"\t"+" Salary is "+sal);
	}

}

public class RecurssiveConstructor{

public static void main(String...abc){
	Recurssive obj1=new Recurssive(10);
    obj1.display();

 }
}

