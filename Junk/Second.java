
import  java.io.*;
public class Second{

// public static void main(String...abc){
//public static void main(String[]args){
public static <t extends String>void main(t[]ram){

  System.out.println("Hello how are you");// Descriptive way--->Real time

// Non Descriptive --> shouls know to understand 
	PrintStream  ps=System.out;
			ps.println("I am from Bangalore");
// 
	Console cn=System.console();
	PrintWriter pw=cn.writer();
	pw.println("I am from Andhra Pradesh");

	System.console().writer().println("hello"); // ?  but confident

  int i=10;
  int j=20;
  System.out.println(i+j);
  Object o=50;
  System.out.println(i+(Integer)o);
  CharSequence ch="10";
  System.out.println(i+Integer.valueOf((String)ch));
  System.out.println(i+Integer.valueOf(ch.toString()));




}
}