
class Student{
	int i=10;
	void m1(){
		int i=20;
		i=30;
		System.out.println(i);
	}
	
	public static void main(String[]args){
		Variable vr=new Variable();
		vr.m1();
	}



}

