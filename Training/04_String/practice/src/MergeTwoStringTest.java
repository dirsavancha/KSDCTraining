// Merging
package practice;
class Merge{
	String s1="hyderabd";
	String s2="bangalore";
	
	void m1(){
		for(int i=0;i<=s1.length()-1;i++){
			String merge=s1.charAt(i)+""+s2.charAt(i);
			System.out.print(merge);
		}
	}
}

public class MergeTwoStringTest{
	public static void main(String...abc){
		Merge m=new Merge();
		
		m.m1();
	}
}