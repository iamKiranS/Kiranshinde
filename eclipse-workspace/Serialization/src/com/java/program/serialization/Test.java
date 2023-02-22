package com.java.program.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Student std = new Student("Kiran", 42, "Natepute");
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kiran Shinde\\OneDrive\\Desktop\\student");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(std);
			oos.close();
			System.out.println("Serialization is done");
		} 
		catch (FileNotFoundException e) {
 			e.printStackTrace();
		}
		
	}
}
