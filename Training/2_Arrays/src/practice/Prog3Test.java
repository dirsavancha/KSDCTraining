// Calling the values indexes

package practice;

class Prog3{
	
	static void show(){
		int[] arr={10,20,30};
		
		System.out.println("Length of an array"+arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
	
}



public class Prog3Test{
	
	public static void main(String...abc){
		Prog3.show();
	}
}