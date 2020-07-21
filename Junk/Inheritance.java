
class Parent{
  static void show1(){
     System.out.println("I am Parent class Method");
   }

}
class Child extends Parent{

static void show2(){
     System.out.println("I am Child class Method");
   }
}

public class Inheritance{

public static void main(String...abc){
  // Child c=(Child)new Parent();
	//c.show1();
	//c.show2();

  Parent p=new Child();

Child c1=(Child)p;
c1.show1();
c1.show2();



}
}