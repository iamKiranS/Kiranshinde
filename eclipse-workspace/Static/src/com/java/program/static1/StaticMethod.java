package com.java.program.static1;

public class StaticMethod {

	public static void method11() {
		System.out.println("inside static method");
	}
	public static void main(String[] args) {
		
		StaticMethod.method11();
		StaticMethod sm = new StaticMethod();
		method11();
		StaticMethod.method11();
		
        //there are three way to call static method 
//		1) claas-name
//        2) methodname
//        3) objectname
	}
}
