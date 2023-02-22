package com.java.program.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class EmpDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Kiran Shinde\\OneDrive\\Desktop\\employee.text");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp1 = (Employee) ois.readObject();
			System.out.println(emp1.empName);
			System.out.println(emp1.empId);
			System.out.println(emp1.empCity);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
