//package controlflow;

class While{
   public void whileMethod(){
	   int count=1;
	   int user=10;
	   while(count<user){
		   System.out.println(count);
		   count++;
	   }
   }
   
   public void doWhile(){
	   int count =1;
	   do{
		   System.out.println(count);
	   }while(count>10);
		   
	   
   }
   
   

}
public class WhileTest{
	   public static void main(String...abc){
		   While w=new While();
		   w.whileMethod();
		   System.out.println("===============");
		   w.doWhile();
	   }
   }   
   
  