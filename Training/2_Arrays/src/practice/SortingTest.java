// Sorting Techniq

package practice;

class Sorting{
  static void method_1(int[] arr){
	  for(int i=0;i<=arr.length-1;i++){
		  for(int j=0;j<=arr.length-1;j++){
			  int temp;
			 temp= arr[i];   // temp-->arr[i]--1
			 arr[i]=arr[j];// arr[i]-->arr[j]
			 arr[j]=temp;// arrj-->temp
		  }
	  }
	  for(int ar:arr){
		  System.out.println(ar);
		  
	  }
  }
}


public class SortingTest{
	public static void main(String...abc){
         
		Sorting.method_1(new int[] {10,20,1,4,5,8});
	}
}