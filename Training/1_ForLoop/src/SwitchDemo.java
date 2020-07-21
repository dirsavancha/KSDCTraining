
import java.lang.invoke.SwitchPoint;
public class SwitchDemo{

public void demoMethod(int id){
	String name=null;
	switch(id){
	case 100: name="Ram";
		 break;
	case 101: name="Hari";
		 break;
	default :  name="Invalid";
		break;
}
System.out.println(name);
}
public static void main(String...abc){
		SwitchDemo sd=new SwitchDemo();
	sd.demoMethod(102);
}


}