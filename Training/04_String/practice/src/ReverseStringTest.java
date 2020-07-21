// Reverse A String

package practice;
// using inbuilt method
class Inbuilt{
	static String s1="hyderabad";
		
		
		static String rev="";
		static void m2()
		{
			
			StringBuffer sb=new StringBuffer(s1);
			sb.reverse();
			String st=sb.toString();
			System.out.println("I  am using inbuilt method "+st);
		}	
}
// With out using inbuilt method
class ReverseString{
	
		static String s1="hyderabad";
		
		
		static String rev="";
	
	static void method_1(){
		System.out.println("Length of s1 "+s1.length());
		for(int i=s1.length()-1;i>=0;i--){ 
		
			rev=rev+s1.charAt(i);  
		}
		   System.out.println(rev);
		  // Checking palindrome or not 
		   if(s1.equals(rev)){
			   System.out.println("palindrom");
		   }else{
			   System.out.println("Not palindrome");
		   }
	}
}
public class ReverseStringTest{
	
	public static void main(String...abc){
		ReverseString.method_1();
		//Inbuilt.m2();
		
		
	}
}