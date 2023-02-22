package com.java.student.program.inheritance;
class A{
	int num=10;
	public void info() {
		System.out.println("Hii");
	}
}
class B extends A{
    public void info() {
	System.out.println("Hello");

	}
}
public class C extends A {

	public static void main(String[] args) {
	
		A a = new B();
		a.info();
		System.out.println(a.num);
		
	}
}
