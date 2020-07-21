
interface ParentInterface{
	
	public static final int i=100;
	                    int j=500;
	public abstract void m1();
	                void m2();
}
interface ParentInterface_2{
	int k=1000;
	void m3();
}
public class ClassInterface implements ParentInterface,  ParentInterface_2 {
	
	public  void m1(){
		System.out.println("class m1 method");
	}
	public void m2(){
		System.out.println("class m2 method");
	}
	public void m3(){
		System.out.println("class m3 method");
	}
	
	public static void main(String...abc){
		ClassInterface obj=new ClassInterface();
		obj.m1();
		obj.m2();
		obj.m3();
		
		
	}
}


