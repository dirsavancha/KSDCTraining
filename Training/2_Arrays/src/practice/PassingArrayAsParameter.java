// Passing array as parameter

package practice;

class Array{
	static void arrayMethod(int[] marks){
		for(int m:marks){
			System.out.println(m);
		}
	}
}

public class PassingArrayAsParameter{
	public static void main(String...abc){
		int[] arr={100,50,80,40};
		Array.arrayMethod(arr);
	}
}