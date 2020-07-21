// AnotherWay to retrive the elements in Passing array as parameter

package practice;

class Array_2{
	static void arrayMethod(int[] marks){
		for(int m:marks){
			System.out.println(m);
		}
	}
}

public class PassingArrayAsParameter_2{
	public static void main(String...abc){
		//int[] arr={100,50,80,40};
		Array_2.arrayMethod(new int[] {100,50,80,40});
	}
}