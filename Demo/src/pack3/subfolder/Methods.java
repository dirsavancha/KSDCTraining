package pack3.subfolder;

public class Methods{

//1. Without returnType and without parameters

public void m1(){
System.out.println("Without returnType and without parameters");
}
//2. Without returnType and with parameters
public void sum(int a,int b){
	System.out.println(a+b);

}
//3.With ReturnType without parameters

public Integer m3(){
	int x=10,y=20;
	int z=x+y;
	System.out.println(z);
	
	return z;
	
}
//4.with ReturnType and with parameters
public int m4(int i,int j){
	int k=i+j;
	System.out.println(k);    
	
	return k;
}

public static void main(String...abc){
	Methods obj=new Methods();
	obj.m1();
	obj.sum(1,2);
	obj.m3();
	obj.m4(50,100);
}



   

}