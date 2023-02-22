package com.java.student.program.polymorphism;

class Demo{
	/*
	public void addition(int a,int b) {
		int c=a+b;
		System.out.println("addition of a and b is        :    "+c);
	}
	public void addition(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("addition of a,b and c is      :    "+d);
		
	}*/
	public void sub(int a ,int b) {
		int c=a-b;
		System.out.println("substraction of a and b is      :    "+c);
	}
	public void sub(int a ,int b,int c) {
		int d=a-b-c;
		System.out.println("substraction of a,b and c is    :    "+d);
	}
}

public class TestMain {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.sub(11, 10);
		d1.sub(33, 22, 11);
	}
	public static void main1(String[] args) {
		Demo d1 = new Demo();
//		d1.addition(12, 12);
//		d1.addition(12, 12, 12);
//		d1.addition(12, 11);
//		d1.addition(11, 10,9);
	}
}
