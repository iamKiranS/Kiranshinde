package com.java.student.program.constructor;

 public class NewConstructor {

	String name;
	int rollNo;
	long mobNo;
	String village;
	String country;
	
	public NewConstructor() {
		this("akshay",12,8838388338l,"Baramati","India");	
		System.out.println("Inside parameterless constructor");

		
	}
	
//	public NewConstructor() {
//		System.out.println("Inside Parameterless Constructor");
//	}
	
	public NewConstructor(String name, int rollNo,long mobNo, String village, String country) {
        System.out.println("Inside Parameterised Constructor");
    this.name=name;
    this.rollNo=rollNo;
    this.mobNo=mobNo;
    this.village=village;
    this.country=country;
	}
	
	public void display() {
		System.out.println("Name           :     "+name);
		System.out.println("rollNo         :     "+rollNo);
		System.out.println("mobNo          :     "+mobNo);
		System.out.println("Village        :     "+village);
		System.out.println("Country        :     "+country);
	}
	
	public void print() {
		System.out.println("Name           :     "+name);
		System.out.println("rollNo         :     "+rollNo);
		System.out.println("mobNo          :     "+mobNo);
		System.out.println("Village        :     "+village);
		System.out.println("Country        :     "+country);
	}

	public static void main(String[] args) {
		
	//NewConstructor nc1 = new NewConstructor("Kiran",42,8865432223l,"Natepute","India");
	NewConstructor nc2 = new NewConstructor();
 
 //	nc1.display();
 	System.out.println();
 	nc2.print();
	}
}
