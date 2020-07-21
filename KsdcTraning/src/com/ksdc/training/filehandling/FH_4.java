package com.ksdc.training.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FH_4 {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		try(FileWriter fw=new FileWriter("D:\\demo.txt")) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the values");
			String s=sc.nextLine();
			fw.write(s);
			
		}
		try(FileReader fr=new FileReader("D:\\demo.txt")){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
				
			}
			
		}
	}
	

}
