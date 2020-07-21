// Constructor Chaining

package practice;

class Constructor{
	
	String name;
	int id;
	float sal;
	long mobile;
	
	Constructor(String name){
		this(101);
		this.name=name;
		
	}
	Constructor(int id){
		this(5000.0f,123456789L);
		this.id=id;
		
	}
	
	Constructor(float sal,long mobile){
		this.sal=sal;
		this.mobile=mobile;
		
	}
	
	void display(){
		System.out.println("Name "+name+"\t"+" id is "+id+"\t"+" Salary is "+sal+"\t"+" Mobile number "+"\t"+mobile);
		}
		
}

public class Chaining{
	public static void main(String...abc){
		Constructor obj1=new Constructor("Ram");
		obj1.display();
	}
}