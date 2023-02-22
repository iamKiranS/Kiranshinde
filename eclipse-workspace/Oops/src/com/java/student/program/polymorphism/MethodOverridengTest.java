package com.java.student.program.polymorphism;
//method overriding 
class MethodOverringDemo{
	
	public void method(int id,String name) {  //same method name with same argument
		System.out.println("id     >>   "+id);
		System.out.println("name   >>   "+name);
	}
}
public class MethodOverridengTest extends MethodOverringDemo{
    @Override
	public void method(int id,String name) {     //same method name with same argument
		System.out.println("id     >>   "+id);
		System.out.println("name   >>   "+name);
	}
	public static void main(String[] args) {
		
		MethodOverridengTest mol = new MethodOverridengTest();
		mol.method(12, "Kiran");
		mol.method(13,"shinde");
	}
}
