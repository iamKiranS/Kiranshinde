package com.java.program.static1;

public class Test {

    int num1 = 10;
	static int num2 = 20;                  //declare instance variable as static 
	
	public static void main(String[] args) {
	
		//static int num3 = 55;            //we cannot make local variable as static
		
		Test t1 = new Test();
		//t1.num1=100;
		Test.num2=200;
		System.out.println(Test.num2);
		
		Test t2 = new Test();
		System.out.println("num1      :    "+t2.num1);   //if we want to access global variable
		                               //inside static method then it is mandtory to take reference of object
		System.out.println("num2      :    "+num2);    //static variable can access directly 
		                                                //bcoz it is  class level

	}
}
