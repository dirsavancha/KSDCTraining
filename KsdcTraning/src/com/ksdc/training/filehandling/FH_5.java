//using BufferdReader and Writer
package com.ksdc.training.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FH_5 {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		try (FileWriter fw=new FileWriter("buffered.csv");BufferedWriter bw=new BufferedWriter(fw);
				Scanner sc=new Scanner(System.in)){
			
			System.out.println("Enter the text");
			String str=sc.nextLine();
			bw.write(str);
		
		}
		try(FileReader fr=new FileReader("buffered.csv");BufferedReader br=new BufferedReader(fr)){
			System.out.println(br.readLine());
		}
			
	
	}

}
