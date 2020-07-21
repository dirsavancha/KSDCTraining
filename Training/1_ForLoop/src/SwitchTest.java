// performing Switch Statement operation

package controlflow;
import java.lang.invoke.SwitchPoint;

class Switch{
	
	public void switchStatement(int id){
		String st_name =null;  // byte short long  --> Byte -----
		
		switch(id){
			
			case 100 : st_name="Raj";
						break;
			case 101 :	st_name="Shyam";
						break;
			case 105 : st_name="Rohan";
						break;
			default : st_name="Invalid"	;
                       break;			
		}
		System.out.println(st_name);
	}
}

public class SwitchTest{
	public static void main(String...abc){
		Switch sw=new Switch();
		sw.switchStatement(10);
	}
	

}