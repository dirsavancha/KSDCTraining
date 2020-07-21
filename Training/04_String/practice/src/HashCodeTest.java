//hashCode

package practice;
class HashCode{
  
	static  void m1(){
		String name="Ram";
		String name2="Ram";
		
		System.out.println("Name1 is "+name+"\t"+"hashcode1 is "+name.hashCode());
		System.out.println("Name2 is "+name2+"\t"+"hashcode2 is "+name.hashCode());
		
	}
}

public class HashCodeTest{

	public static void main(String...abc){
		HashCode hc=new HashCode();
		hc.m1();
	}

}