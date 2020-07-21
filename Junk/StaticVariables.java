public class StaticVariables{
	
	static int i=10;
	int j=20;
	
	void m1(){
		/*System.out.println(StaticVariables.i);//10
		StaticVariables.i=50;
		System.out.println(StaticVariables.i);//50*/
		System.out.println(j);
		
	}
	public static void main(String...abc){
		StaticVariables st=new StaticVariables();           // i=50
		System.out.println(st.j);
		
		StaticVariables st1=new StaticVariables();
		System.out.println(st1.j=100);
		
	}
	
}