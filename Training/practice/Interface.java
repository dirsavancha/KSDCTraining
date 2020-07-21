public class Demo implements Pract1,Pract2{
  	 public void createAccount(){
  
		System.out.println("I am from class");
	}
 	public void credit(){
		Pract1.super.credit();
  		 System.out.println("I am class Credit");
	}
	public void createLoan(){
		System.out.println("I am class loan");
	}
	public static void main(String...abc){
		Demo obj=new Demo();
     		obj.createAccount();
     		obj.credit();
     		obj.createLoan();
		Pract1.account();
	}
}



interface Pract1{

  	public static final int i=100;
   	int j=10;

  	public abstract void createAccount();

	default void credit(){
  		 System.out.println("I am interface1 Credit");
	}
	static void account(){
System.out.println("I am Static method");
	} 
}

interface Pract2 {
	void createLoan();
	default void lifeInsurance(){
		System.out.println("I am interface2 life Insurance");
	}
}