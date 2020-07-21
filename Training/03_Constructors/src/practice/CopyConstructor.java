// Copy constructor

package practice;

class CopyExample{

String name;
   CopyExample( String name){
   this.name=name;
   }
    CopyExample( CopyExample ce){
    name=ce.name;
   }
   void display(){
	   System.out.println("Name is"+name);
   }
}

public class CopyConstructor{

public static void main(String...abc){
	CopyExample obj1=new CopyExample("Ram");
	obj1.display();
	CopyExample obj2=new CopyExample(obj1);
	obj2.display();

}
}