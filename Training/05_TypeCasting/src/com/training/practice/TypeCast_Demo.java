// Type Casting primitives
package com.training.practice;

class PrimitiveTypeCastingWidening{
	// byte,short,int,long,float,double
	//--------------------> widening
	void  widening(){
		byte b=10;
		System.out.println(b);
		int i=b;//int i=(int)b; implicty compiler will cast
		System.out.println(i);
	}
	
	void narrowing(){ // explicity perform casting
		float f=400.50f;
		int i1=(int)f;// float value f=400.50f is converting in to int data type and storing in to int datat type with refrence of i1;
		System.out.println(i1);
		char c='M';
		int i2=(int)c;
		System.out.println("I am char value "+i2);
		float f1=(float)c;
		System.out.println("I am char value of float "+f1);
	}
}
public class TypeCast_Demo{
	public static void main(String...abc){
		PrimitiveTypeCastingWidening obj=new PrimitiveTypeCastingWidening();
		obj.widening();
		obj.narrowing();
	}
}




