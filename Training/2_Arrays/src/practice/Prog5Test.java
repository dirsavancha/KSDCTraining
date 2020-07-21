// Provide Runtime  values

// Calling the values indexes

//package practice;
import java.util.*;

class Prog5{
	int i;
	static void show(){
		int arr[]=new int[3];   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<arr.length;i++){
			
		arr[i]	=sc.nextInt();
			
		}
		for(int abc:arr){
			System.out.println(abc);
			
		}
		
	}
	
}

public class Prog5Test{
	
	public static void main(String...abc){
		Prog5.show();
	}
}