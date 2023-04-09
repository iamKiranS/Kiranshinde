package com.java.program.static1;

public class Static1 {

	public void test() {
		System.out.println("non-static member");
		Static1.demo();
	}
	
	public static void demo() {
		System.out.println();
	System.out.println("static member");
	}
	public static void main(String[] args) {
		
		Static1 sm = new Static1();
		sm.test();
	}

	 
}
