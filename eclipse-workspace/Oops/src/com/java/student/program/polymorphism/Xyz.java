package com.java.student.program.polymorphism;

public class Xyz extends PolyOverride{

	@Override
	public void method1(int a, int b) {
		System.out.println(a+"      "+b);
		//super.method1(a, b);
	}

	public static void main(String[] args) {
		
		PolyOverride m1 = new PolyOverride();
		m1.method1(11,11);
		
		 Xyz x1 = new Xyz();
		 x1.method1(11, 22);
	}


}
	 