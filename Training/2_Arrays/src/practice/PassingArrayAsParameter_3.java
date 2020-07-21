// Passing multiple arrays as parameter

//package practice;

class Array_3{
	static void arrayMethod(String[] name,int[] marks){
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+""+marks[i]);
		}
	}
	static void arrayMethod_1(String[] name,int ... marks){
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+""+marks[i]);
		}
	}
}

public class PassingArrayAsParameter_3{
	public static void main(String...abc){
		//int[] mark={100,50,80,40};
		//String[] nam={"Ram","Shyam","Latha"};
		Array_3.arrayMethod(new String[] {"Ram","Shyam","Latha"},
							new int[] {100,50,80});
		Array_3.arrayMethod_1(new String[] {"Bangalore","Chennai","Hyderabad"},
							new int[] {070,080,090}); // octal value range 0-7
	}
}