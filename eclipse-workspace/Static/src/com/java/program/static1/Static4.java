package com.java.program.static1;

public class Static4 {

	int num1 = 12;
	static int num2=11;
	
	public static void method() {
		System.out.println(num2);
		Static4 s2 = new Static4();

		System.out.println(s2.num1);
	}
	public static void main(String[] args) {
		method();
 	}
}
