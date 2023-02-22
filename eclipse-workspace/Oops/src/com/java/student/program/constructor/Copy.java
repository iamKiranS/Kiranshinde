package com.java.student.program.constructor;

public class Copy {

	private String name;
	private int id;
	private String city;
	
	public Copy(String name, int id, String city) {
		System.out.println("parameterized constructor");

		this.name = name;
		this.id = id;
		this.city = city;
	}
	public Copy(Copy copy) {
		System.out.println("copy constructor");
		
	}
	public void print() {
 
		System.out.println(name);
		System.out.println(id);
		System.out.println(city);

	}

	public static void main(String[] args) {
		
		Copy c = new Copy("Kiran", 22, "Mumbai");
		c.print();
		Copy copy = new Copy(c);
		c.print();
	}
}
