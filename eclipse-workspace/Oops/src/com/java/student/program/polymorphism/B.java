package com.java.student.program.polymorphism;

public class B extends A{

	@Override
	public void getA() {
 		System.out.println("Inside B");
 	}
	
	public static void main(String[] args) {
		 
		B b = new B();
		b.getA();
	}
}
