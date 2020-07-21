// Array Object
package practice;

class Student{
	String name,adress;
	int id,marks;
	
	Student(String name,int id,int marks,String adress){
		this.name=name;
		this.id=id;
		this.marks=marks;
		this.adress=adress;
	}
	
	
}
public class ObjectArray{
	public static void main(String...abc){
		//String arr1=new String[3][3];
	Student s1= new Student("Ram",100,80,"Bangalore");
	Student s2= new Student("Hari",101,50,"Hyderabad");
	Student s3= new Student("Latha",102,40,"");
	System.out.println("Name"+"\t"+"ID"+"\t"+"marks"+"\t"+"Adress");
	Student[] arr=new Student[3];
	arr[0]=s1;
	arr[1]=s2;
	arr[2]=s3;
	
	for(Student s:arr){
		System.out.println(s.name+"\t"+s.id+"\t"+s.marks+"\t"+s.adress);
	}
	
	}
	

}