package com.ksdc.training.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sun.xml.internal.ws.encoding.fastinfoset.FastInfosetCodec;

public class FH_1 {
	public static void main(String[] args) {
		FileOutputStream fos =null;
		try {
			 fos = new FileOutputStream("writer.txt");
		} catch (FileNotFoundException e) {

		}
		String s="Where are you";
		byte [] b=s.getBytes();
		 try {
			fos.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		 
	}
}
