package com.ksdc.training.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	 String name;
	 int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}

public class FH_7 {

	static void input() throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream("hello.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			System.out.println(ois.readObject());
          
		}
	}

	static void output() throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("hello.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Student s1 = new Student("Ram", 101);
			oos.writeObject(s1);
			
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		output();
		input();
	}

}
