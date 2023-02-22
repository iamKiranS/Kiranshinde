package com.java.program.opps.abstraction;

interface A {
	// int num; //inside interface it is mandtory to initialised the variable bcoz
	// it is by default final
	int num1 = 10;
	int num2 = 20;

	void print(); // interface contain only abstract method ,not contain concrete method
}

class B implements A {
	@Override
	public void print() {
		System.out.println("num1      :    " + A.num1);
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println("num2      :    " + A.num2);
		A a = new B();
		a.print();
		// we can access num inside static method becoz interface variable by default
		// public static
		// and static variable we can access by using classname
	}

	public static void main1(String[] args) {
		B b = new B();
		b.print();
	}
}
