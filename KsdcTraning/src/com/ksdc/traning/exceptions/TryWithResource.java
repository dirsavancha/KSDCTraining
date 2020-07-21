package com.ksdc.traning.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResource {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fis= new FileInputStream("E:\test.xls")){
			 PrintWriter pw=new PrintWriter("");
			 pw.print("dnjndj ");
			 pw.close();
					 
					 
		}
		
	}

}
