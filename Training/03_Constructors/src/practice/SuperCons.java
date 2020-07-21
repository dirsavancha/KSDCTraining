// About super();

package practice;

class Parent {
	Parent(int i){
		System.out.println("I am Parent");
	}
	
}
class Child extends Parent {
	Child(){
		
		System.out.println("I am Child");
		
	}
}

public class SuperCons{
	public static void main(String...abc){
		Child ch=new Child( 10);
		
	}
}

