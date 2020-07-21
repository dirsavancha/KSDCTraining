// diffrence between Object class equals() and String class equals();

package practice;
class First{
	int id;
	First(int id){
		this.id=id;
	}
	void show(){
		System.out.println("id is"+id);
	}
	

}


class Second{
	int id;
	Second(int id){
		this.id=id;
	}
	void show(){
		System.out.println("id is"+id);
	}
	
	
	public boolean equals(Second s) {
		if(this.id!=s.id){
			return false;
		}
		return true;
	}
}
public class StringClassEquals{
	
	public static void main(String...abc){
		First f1=new First(10);
		First f2=new First(10);
		System.out.println("First class Comparing"+f1.equals(f2));
		
		Second s1=new Second(10);
		Second s2=new Second(10);
		System.out.println("Second class Comparing"+s1.equals(s2));
	}
}