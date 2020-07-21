

public class ReverseDigit{
public static void rev(int num){
		int rev=0;
		int digit=0;
		
		for(int i=num;i!=0;i/=10){
			int d=i%10;
			rev=rev*10+d;
		}
		System.out.println(rev);
		
	}
	public static void main(String...abc){

ReverseDigit rd=new ReverseDigit();
rd.rev(123456);


}
}




		
