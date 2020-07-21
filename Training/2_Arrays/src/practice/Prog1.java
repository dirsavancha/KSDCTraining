// Basic Array Program

package practice;

class BasicProg{
	
	static void show(){
		int[] arr={10,20,30};
		
		System.out.println("Length of an array"+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
}

public class Prog1{
	
	public static void main(String...abc){
		BasicProg.show();
	}
}