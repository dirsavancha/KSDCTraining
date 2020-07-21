
class A{
	private void show(){
		System.out.println("I am A class show method");
	}
	public void display()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
public class Demo{
	private void m1(){
		System.out.println("Ia m private method");
	}
	public void m2(){
		System.out.println("Ia m public method");
	}
	

	public static void main(String...abc){
		/*Demo d=new Demo();
		d.m1();// It access with in class
		d.m2();// compulsor*/
		A a=new A();
		a.display();
		//a.show();
	}
}



