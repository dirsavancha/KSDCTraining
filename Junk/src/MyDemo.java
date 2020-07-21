
class A{
	int i=10;
	static int j=20;
	
			
	static void m1(){
		//System.out.println(i);
		System.out.println(j);
	}
	void m2(){
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String...abc){
		A obj=new A();
		obj.m1();
		obj.m2();
	}
}
	
	
