// Calling the values indexes

package practice;

class Prog4{
	
	static void show(){
		int arr[]=new int[3];   
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		//arr[3]=40;
		
		
		
		System.out.println("Length of an array"+arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		// Enhaced Forloop or Advanced forLoop
		     
		for(int data:arr)
			System.out.println(data[0]);
		}
		
	}
	
}



public class Prog4Test{
	
	public static void main(String...abc){
		Prog4.show();
	}
}