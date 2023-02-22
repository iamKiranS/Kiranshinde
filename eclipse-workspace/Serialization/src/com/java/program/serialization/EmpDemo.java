package com.java.program.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpDemo {

	public static void main(String[] args) throws IOException {
		
		Employee emp = new Employee("Ram", 123, 44000, "Pune");
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kiran Shinde"
					+ "\\OneDrive\\Desktop\\employee.text");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			//oos.close();
			System.out.println("serialization is done......");
		} 
		catch (FileNotFoundException e) {
 			e.printStackTrace();
		}
	}
}
