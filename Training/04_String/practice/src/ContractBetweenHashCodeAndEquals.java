

// Contract b/n hashcode() and equals()

package practice;

class Contract{
	String name;
	int age;
	Contract(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Contract c){
	if(this.name!=c.name){
		return false;
	}
	if (this.age!=c.age){
		return false;
	}
	return true;
}
	public int hashCode() {
		
		return super.hashCode();
	}

public String toString(){
	return "Name is "+name+"Age is "+age;
}
	
}

public class ContractBetweenHashCodeAndEquals{
	
	public static void main(String...abc){
		Contract f1=new Contract("Ram",34);
		Contract f2=new Contract("Hari",25);
		Contract f3=new Contract("Ram",30);
		Contract f4=f3;
		System.out.println(f1==f2);//false
		System.out.println(f2==f3);//false
		System.out.println(f1.equals(f3));//false
		System.out.println(f3==f4);//true
		// hashcode
		System.out.println("HashCode");
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println(f3.hashCode());
		System.out.println(f4.hashCode());
		
		
	}
}





