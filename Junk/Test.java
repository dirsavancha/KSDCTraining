
import java.io.*;
public class Test{
	
	//public static void main(String...abc){
	//public static void main(String[]args){
		public static <T extends String> void main(T[]Ram){  // Way writing Dynamic 
		
		int i=10;
		int j=20;
		System.out.println(i+j);//30
		Object o=50;
		System.out.println(i+(Integer)o);//60
		CharSequence ch="100";
		System.out.println(i+Integer.valueOf(ch.toString()));//110
		
		
	}
}