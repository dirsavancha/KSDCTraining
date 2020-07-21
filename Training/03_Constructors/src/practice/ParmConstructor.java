// Initilizing instance variables

package practice;

class InstanceVariables_1{
	String name;
	int id;
	double d;
	
	
	InstanceVariables_1(){
		
		System.out.println("I am Non Par Const");
	}
	InstanceVariables_1(String name,int id){
		this.name=name;
		this.id=id;
		
		// This keyword refers to the current class object
		
	}
	void display(){
		System.out.println("Name is "+name+"Id is "+id);
	}
	InstanceVariables_1(String Firstname,double d){
		this.name=Firstname;
		this.d=d;
		
		// This keyword refers to the current class object
		
	}
	
	
}

public class ParmConstructor{
	
	public static void main(String...abc){
		InstanceVariables_1 obj=new InstanceVariables_1();
		InstanceVariables_1 obj1=new InstanceVariables_1("Ram",101);
		obj1.display();InstanceVariables_1 obj2=new InstanceVariables_1("HAri",10);
		obj2.display();
	}
}