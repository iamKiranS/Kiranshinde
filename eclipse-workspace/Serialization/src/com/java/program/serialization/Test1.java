package com.java.program.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable{
	 
	String name;
	int bestScore;
	String country;
	
	public Cricketer(String name, int bestScore, String country) {
		this.name = name;
		this.bestScore = bestScore;
		this.country = country;
	}
	
}
public class Test1 {

	public static void main(String[] args) throws IOException {
		
		Cricketer c1 = new Cricketer("Virat", 183, "India");
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kiran Shinde\\OneDrive\\Desktop\\virat.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(c1);
			
			System.out.println("done");
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		}
	}
}
