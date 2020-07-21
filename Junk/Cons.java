class H{

  H(){

System.out.println("I am Class H");
}
}

class A extends H{
	A(){
System.out.println("I am Class A");
}
	A(int a){

	}
}
public class Cons extends A{


   Cons(){
   System.out.println("I am Class Cons");
}

public static void main(String...abc){

Cons c=new Cons();

}
}