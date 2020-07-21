// toSTring
package practice;
class ToString {
	String name;
	String colour;
	
	ToString(String name,String colour){
		this.name=name;
		this.colour=colour;
	}
	
	

	
	public String toString(){
		  return name + colour;
	}

}
public class ToStringTest{

	public static void main(String...abc){
		
		ToString ts=new ToString("Ram","white");
		
		System.out.println(ts);
		
		
		
		
		
		
		

	}

}