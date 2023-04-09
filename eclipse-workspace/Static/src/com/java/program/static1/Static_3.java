package com.java.program.static1;

import java.io.PrintStream;

class TestDemo{
	  int num1;
	  int num2;
	 static int num3;   //it should have common copy
	 
	public TestDemo(int num1, int num2) {
     this.num1=num1;
     this.num2=num2;
     this.num3=num3 = 500; //share the value of num3 for all instaces
	 }                      //thats why we make num3 as static

	public void dispaly() {
		 System.out.println("num1        :    "+num1);
		 System.out.println("num2        :    "+num2);
 		 System.out.println("num3        :    "+num3);
	 }
}
public class Static_3 {
	public static void main(String[] args) {
		
		TestDemo t1 = new TestDemo(10,20);  //object create
		TestDemo t2 = new TestDemo(30,40);
		TestDemo t3 = new TestDemo(50,60);
		t1.dispaly();                        //method get called 
		t2.dispaly();                       
		t3.dispaly();                        
	}
}
