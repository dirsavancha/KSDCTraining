// Access specifiers from various class
package pack1.subfolder;


public class One{
	private void m1(){
		System.out.println("I am FirstOne Clas Private Method");
	}
	protected void m2(){
		System.out.println("I am FirstOne Clas Protected Method");
		
	}
	void m3(){
		System.out.println("I am FirstOne Classs Default Method");
	}
	public void m4(){
		System.out.println("I am FirstOne Class Public Method");
	}
	
	public static void main(String...abc){
		One fo=new One();
		fo.m1();
		fo.m2();
		fo.m3();
		fo.m4();
		
	}
}