package com.ksdc.training.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FH_2 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream("writer.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		  try {
			  byte [] arr=new byte[fis.read()];
		  }catch(IOException e) {
			  e.printStackTrace();
		  }
		 // System.out.println(fis);
		  int i=0;
		  try {
		  while((i=fis.read())!=-1) {
			  System.out.print((char)i);
		  }
		  }catch (IOException e) {
			  e.printStackTrace();
		}
	}

}
