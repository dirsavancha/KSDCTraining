
// pattren of design wrapping each object in 

//to a new object that adds more responsibilities
package com.ksdc.training.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FH_6 {
	
	public static void main(String[] args) {
		try {
			File fi=new File("src.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(fi),"UTF8"));
			int i=0;
			while((i=br.read())!=-1) {
				System.out.print((char)i);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
		   e.printStackTrace();
		}
		
	}

}
