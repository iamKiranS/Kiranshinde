package com.java.student.program.inheritance;
//hierarchical inheritance

class Class1{
	String str1 = "Hello everyone.....!!!!";
}

class Class2 extends Class1{
	String str2 = "Welocome to java programming......!!!!!";
}
public class MyClass extends Class2{
	String str3 = "Nice to meet you.....!!!!!";

	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		
		System.out.println(mc.str1);
		System.out.println(mc.str2);
	    System.out.println(mc.str3);

 
	}

}
