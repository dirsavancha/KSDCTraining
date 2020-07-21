class Data{
	
		byte b;
		short sh;
		int i;
		long l;
		char ch;
		Integer in;
		Byte by;
		
	void m1(){
		
		System.out.println("byte default value is"+b);
		System.out.println("short default value is"+sh);
		System.out.println("int default value is"+i);
		System.out.println("long default value is"+l);
		System.out.println("Integer default value is"+in);
		System.out.println("Char default value is"+ch+"hello");
		System.out.println("Byte default value is"+by);
	}
		
	public static void main(String...abc){
		Data d=new Data();
		d.m1();

	}
}
		
	
		
	
