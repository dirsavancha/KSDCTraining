package com.ksdc.training.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class WriteOperation {

	static void write() throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("src.txt")) {
			String s = "Hello india";
			fos.write(s.getBytes());
		}
	}

}

class ReadOperation {

	static void read() throws FileNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream("src.txt")) {
			byte[] arr = new byte[fis.read()];
			int i = 1;
			while ((i = fis.read()) !=-1) {
				{
					System.out.print((char) i);
				}
			}    
		}
	}
}

public class FH_3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		WriteOperation obj = new WriteOperation();
		obj.write();
		ReadOperation obj2 = new ReadOperation();
		obj2.read();
	}

}
