package com.java.program.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PersonInfo implements Serializable {

	String name;
	String city;
	long mobNo;

	public PersonInfo(String name, String city, long mobNo) {
		this.name = name;
		this.city = city;
		this.mobNo = mobNo;
	}
}

public class Person {

	public static void main(String[] args) throws IOException {

		PersonInfo pi = new PersonInfo("ajay", "pune", 9999732333l);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kiran Shinde\\OneDrive\\Desktop\\personinfo.text");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pi);

			System.out.println("serialization is done......!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
