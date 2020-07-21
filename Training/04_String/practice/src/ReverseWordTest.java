// Reverse a word

package practice;

class ReverseWord{
	String s1="Art of Living";
	String rev="";
	
	
	void m1(){
		String[] splt=s1.split(" ");
		for(int i=0;i<splt.length;i++){
			String word=splt[i];
			for(int j=word.length()-1;j>=0;j--){
				rev=rev+word.charAt(j);
			}
			
		}
		System.out.println(rev);
		
		
	}
	
}
public class ReverseWordTest{
	public static void main(String...abc){
		ReverseWord rw=new ReverseWord();
		rw.m1();
		
	}
}