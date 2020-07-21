

public class Basic{
	
	String name="Yeswanth";
	int age=25;
	int i=10;
	int j=20;
	Object o=20;
	
	
	void speak(){
		
		System.out.println(name+"can speak");
		
	}
	
	public static void main(String[]args){
		Basic obj=new Basic();
		obj.speak();
	}
	
}