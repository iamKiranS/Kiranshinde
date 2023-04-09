package com.java.program.static1;

public class Static2 {

	static {
		System.out.println("first static initializer block");
		num1=10;
		System.out.println("num1      :    "+Static2.num1);  
	}                                    
    static int num1;
	static int num2;
	static int num3;
	
	static {
		System.out.println("second static initializer block");
		num2=20;
		System.out.println("num2      :    "+num2);
	}
	static {
		System.out.println("third static initializer block");
		num3=30;
		System.out.println("num3      :    "+num3);
	}
	public static void main(String[] args) {

		//if we want to some output before execution of main method then
	//we use static initializer block and it will get execute sequentially
		
	}
}
