class Calling{
	
	static int i=10;
	int j=20;
	
	static void m2(){
		// Calling static variable in to static method
		System.out.println(i);
		System.out.println(new Calling().j);
	}
	void m1(){
		System.out.println(Calling.i);
		System.out.println(j);
		
	}
	
	
	public static void main(String...abc){
		Calling c=new Calling();
		c.m1();
		Calling.m2();
		
		
		
		
	}
}