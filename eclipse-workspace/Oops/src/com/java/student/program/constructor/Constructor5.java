package com.java.student.program.constructor;

public class Constructor5 {
	
	private String name;
	private int id;
	private long mob;
	
	public Constructor5() {
		this("Akshay", 13, 8830057979l);
		System.out.println("Inside parameterless ctor");
	}
	public Constructor5(String name, int id, long mob) {
		this.name = name;
		this.id = id;
		this.mob = mob;
		System.out.println("Inside parameterized ctor");
		
		System.out.println();
		System.out.println(name);
		System.out.println(id);
		System.out.println(mob);
	}
	
	public static void main(String[] args) {
		Constructor5 c5 = new Constructor5();
	}
	
/**
	String name;
	int rollno;
	String city;
	
	public Constructor5(String name, int rollno, String city) {
		this.name = name;
		this.rollno = rollno;
		this.city = city;
		
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(city);
	}

	public static void main(String[] args) {
		
		Constructor5 c5 = new Constructor5("Kiran", 12, "NAtepute");
		Constructor5 c6 = new Constructor5("Ak", 52, "Akluj");
		Constructor5 c7 = new Constructor5("Rs", 9, "Indapur");

	}
	*/
}
