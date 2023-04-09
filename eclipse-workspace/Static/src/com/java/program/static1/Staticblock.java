package com.java.program.static1;

public class Staticblock {

	int a = 20;
	static int b = 10;
	
	static {
//		System.out.println(a);   //nonsatic cannot access inside static block
		Staticblock sb = new Staticblock();
	//	System.out.println(sb.a);   //by using object reference we can access
		System.out.println(b);
		System.out.println("inside static block");
	}
	public static void main(String[] args) {
		
		System.out.println("inside the main method");
	}
}


//static block execute before the main method 
//no need to creation of object