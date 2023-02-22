package com.java.program.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MobileMain {

	public static void main(String[] args) throws IOException {
 
		Mobile m = new Mobile("Nokia", 6252);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kiran Shinde\\OneDrive"
					+ "\\Desktop\\Person.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			System.out.println("successfully data updated");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
