// StringBuffer

package practice;

public class StringBufferTest{
	public static void main(String...abc){
		
		StringBuffer sb=new StringBuffer("Ramak");
		System.out.println(sb);
		//System.out.println(sb.append("drk"));
		//StringBuffer sb1=sb.insert(1,"ch");
		//System.out.println(sb1);
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse "+rev);
		System.out.println("capacity is"+sb.capacity());
		
	}
}


