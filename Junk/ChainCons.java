
class Parent{

Parent(){

  System.out.println("I am Parent");
}
}
class A extends Parent{
  	String name;
	int id;
	float sal;
	Long l;

 	A(int a){
	this(500.0f,8050971098l);
	  this.id=a;

 	}

 	A( String b){
	this(20);
	this.name=b;
 	}

 	A(float f,long l){

        this("Ram");
	this.sal=f;
	this.l=l;
 	}

void display(){
  System.out.println("Name"+"\t"+"ID"+"\t"+"Salary"+"\t"+"Mobile");
  System.out.println(name+"\t"+id+"\t"+sal+"\t"+l);
}
public static void main(String...abc){
   	A a1=new A(10);
	a1.display();
	
}

}