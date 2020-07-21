import java.util.Arrays;
import java.util.Scanner;

class Student{
	int id,marks;
	String name;
	Student(int id,String name,int marks){
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	
	
	
}

class Swap{
	void m1(){
		int a=1,b=2,c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("a value is"+a+"b val is"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is"+a+"b val is"+b);
		
	}
	
}

public class A {
	 public static void main(String[] args) {
		
		/* int a=1,b=2,c=1;
		 
		// int[] arr ={1,2,3,4}; //sttaic arr
		 
		   System.out.println(arr[0]);
		   System.out.println(arr[1]);
		 char arr[] = {'a','s','d'};
		 int n = arr.length; //4
		 for(int i=0;i<n;i++){
			 System.out.println(arr[i]);
		 }*/
		   
		 String[] str =new String[3];
		/* str[0]="Hello";
		 str[1]="How";
		 str[2]="are You";
		 
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<str.length;i++){
			 
			 System.out.println("Enter Values");
			 str[i] =sc.next();
			 
			 //System.out.println(str[i]);		
			 
		 }
		 for(String s:str){
			 System.out.println(s);
		 }
		 
	      String[][] arr1=new String[2][3];	 
	      
	      arr1[0][0]="100";
	      arr1[0][1]="Ram";
	      arr1[0][2]="50";
	      arr1[1][0]="100";
	      arr1[1][1]="Ram";
	      arr1[1][2]="50";
	      System.out.println(arr1[0].length);
	      System.out.println("id\tname\tmarks");
	      for(int i=0;i<arr1.length;i++){
	    	  for(int j=0;j<arr1[i].length;j++){
	    		  System.out.print(arr1[i][j]+"\t");
	    	  }
	    	  System.out.println();
	    	  
	      }
		 Student s1=new Student(100,"Ram" , 50);
		 Student s2=new Student(100,"Hari" , 78);
		 Student s3=new Student(100,"Shyam" , 48);
		 
		 Student[] arr2=new Student[3];
		 arr2[0]=s1;
		 arr2[1]=s2;
		 arr2[2]=s3;
		 System.out.println("Id\tname\tmarks");
		 for(Student s:arr2){
			 System.out.println(s.id+"\t"+s.name+"\t"+s.marks);
		 }
		 Swap sp=new Swap();
		 sp.m1();*/
		 
		 
		 int[]arr3={2,4,8,3,4,1,5,9,0};
		 
		 int temp=0;
		 for(int i=0;i<arr3.length;i++)
		 {
			 for(int j=i+1;j<arr3.length;j++){
				 if(arr3[i]>arr3[j]){
					 
					 temp=arr3[i];
					 arr3[i]=arr3[j];
					 arr3[j]=temp;
				 }
			 }
		 }
		 
		 for(int ele : arr3){
			   System.out.println(ele);
		 }
		 
		 Arrays.sort(arr3);
		 for(int it:arr3){
		 System.out.println(it);
		 }
		 for(int i=arr3.length-1;i>=0;i--){
			 System.out.println(arr3[i]);
			 
		 }
	}
	 
	 
	 

}
