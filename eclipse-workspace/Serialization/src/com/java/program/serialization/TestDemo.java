package com.java.program.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyInfo {

	String name;
	String city;
	long mobNo;

	public MyInfo(String name, String city, long mobNo) {
		this.name = name;
		this.city = city;
		this.mobNo = mobNo;
	}
}

public class TestDemo {

	public static void main1(String[] args) throws IOException {

		MyInfo mi = new MyInfo("Kiran", "Natepute", 9370637552l);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kiran Shinde\\OneDrive" + "\\Desktop\\sandeep.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(mi);

			System.out.println("You have done serialization successfully.....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
 