package com.java.student.program.inheritance;
//inheritance
class Test{
	int num1=10;
	void method1() {
		System.out.println("num1     >>   "+num1);
	}
}
class Demo extends Test{
	int num2=20;
	void method2() {
		System.out.println("num2     >>   "+num2);
	}
}
public class Inheitance2 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.method2();
		demo.method1();
	}
}
