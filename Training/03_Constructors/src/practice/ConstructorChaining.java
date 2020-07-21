// Constructor Chaining

package practice;


class Student{
	String name;
	int id;
	float sal;

	Student(int id){
		
		this.id=id;
		
	}
	Student(String name){
		this.name=name;
		

	}
	Student(float sal){
		this(id)
		this.sal=sal;

	}
	
	
	void display(){
		System.out.println("Name is"+name+"id is "+id+"sal is "+sal);
	}

}

public class ConstructorChaining{
	public static void main(String...abc){
		
		Student s2=new Student(10,"Ram",5000.0f);
		s2.display();
		
		
	}
	
}