//

package practice;
import java.lang.String;

class StringProg2{
	static void m1(){
	String s1="welcome to hyderabad";
	String s2="welcome to hyderabad";
	System.out.println(s1==s2);// true
	String s3="welcome to";
	String s4=" hyderabad";
	String s5="welcome to"+" hyderabad"; //"welcome to hyderabad"
	System.out.println(s1==s5);// true
	String s6=s3+s4;
	System.out.println(s1==s6);
	String s7="welcome to"+s4;
	System.out.println(s1==s7);
	
}
}

class StringProg3{
	static void m2(){
		String st1=new String("Chennai");
		 //String st2= st1.toUpperCase();
		 String st3= st1.toLowerCase();
		 
		// System.out.println(st1==st2); // False
		  System.out.println(st1==st3);//True
		
		}
}
class StringProg4{
	
	static void m3(){
		String str1="Rose";
		String str2=" Lily";
		char ch=str1.charAt(1);
		System.out.println(ch); 
		String str3=str1.concat(str2);
		System.out.println(str3);
	}
}

public class SecondStringProg{
	
	public static void main(String...abc){
		//StringProg2.m1();
		//StringProg3.m2();
		StringProg4.m3();
	}
}