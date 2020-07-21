package com.junk;
class Demo{
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	String str;
	char ch;
	boolean bol;
	
	Byte By;
	Short Shrt;
	Integer Int;
	Long L;
	Float F;
	Double D;
	Character Ch;
	Boolean Bool;
	
	Number num;
	CharSequence chseq;
	//Serializable ser;
	Comparable cm;
	
	 
	
	void m1(){
		System.out.println("byte default value is"+b);
		System.out.println("short default value is"+s);
		System.out.println("int default value is"+i);
		System.out.println("long default value is"+l);
		System.out.println("float default value is"+f);
		System.out.println("double default value is"+d);
		System.out.println("String default value is"+str);
		System.out.println("char default value is"+ch+"is");
		System.out.println("boolean default value is"+bol);
		System.out.println("==============");
		System.out.println("byte default value is"+By);
		System.out.println("short default value is"+Shrt);
		System.out.println("int default value is"+Int);
		System.out.println("long default value is"+L);
		System.out.println("float default value is"+F);
		System.out.println("double default value is"+D);
		System.out.println("String default value is"+Ch);
		System.out.println("char default value is"+Ch);
		System.out.println("boolean default value is"+Bool);
		System.out.println("==============");
		System.out.println("Number default value is"+num);
		System.out.println("Charsequence default value is"+chseq);
		//System.out.println("serializable default value is"+ser);
		System.out.println("comparable value is"+cm);
	}
	public static void main(String...abc){
		Demo d=new Demo();
		d.m1();
		
			
		}
		
	
}

