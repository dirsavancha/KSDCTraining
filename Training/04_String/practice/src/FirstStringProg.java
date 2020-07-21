
package practice;

class First{
	int id;
	First(int id){
		this.id=id;
	}
	void show(){
		System.out.println("id is"+id);
	}
}

class StringDemo{
	  static void display(){
		  
	  
	String s1="chennai";
	String s2="chennai";
	String s3=new String("chennai");
	String s4="bangalore";	
       // s1=s2=chennai--->scp
	   // heap--> chennai-->s3
	   // == operator
	System.out.println(s1==s2);// true
	System.out.println(s1==s3);// false
	System.out.println(s2==s3);// false
	
	//Stringclass.equals ();
	System.out.println(s1.equals(s2));   //.equals:Only String class equals method checks the content.
	System.out.println(s1.equals(s3));   // == --> checks the rfrences of an object,if both refrences are pointing to a single object
	System.out.println(s2.equals(s3));   // means it is true else false
	System.out.println(s2.equals(s4));
	
	}
}


/*what is the diffrence b/n == .equals()
== operator will checks that both ref is pointing to same obj or not if both are pointing tosame object then it return true else returns fal false
.equals()--> string class .equals() compare the content of two objects if both are same then it returns true
Object class .equals()--> compares the refrences 
== Objclass .equals-->same*/
public class FirstStringProg{
	
	public static void main(String...abc){
		//StringDemo.display();
		First f1=new First(10);
		f1.show();
		First f2=new First(10);
		f1.show();
		System.out.println(f1.equals(f2));
	}
}