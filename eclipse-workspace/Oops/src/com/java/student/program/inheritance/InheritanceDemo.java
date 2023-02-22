package com.java.student.program.inheritance;
class Inherite1{

	int a=10;
	int b=20;
	
	public void method1() {
		System.out.println("inside method1");
	}
	public void method2() {
		System.out.println("inside parent method2");
	}
}
class Inherite2 extends Inherite1{
	int b=30;
	int c=40;
	
	public void method2() {
		System.out.println("inside child method2");
	}
	public void method3() {
		System.out.println("inside method3");
	}
}
public class InheritanceDemo  {
	
	public static void main(String[] args) {
		Inherite1 i6=new Inherite2();
		Inherite2 i7=new Inherite2();
		i7=(Inherite2)i6;
		System.out.println(i7.a);
		System.out.println(i7.b);
		System.out.println(i7.c);
		  i7.method1();
	      i7.method2();
	      i7.method3();
	}

	public static void main5(String[] args) {
		Inherite1 i4=new Inherite1();
		Inherite2 i5=new Inherite2();
		i4=i5;
		System.out.println(i4.a);
		System.out.println(i4.b);
	//	System.out.println(i4.c);
		  i4.method1();
	      i4.method2();
	      i5.method3();
	}
	public static void main3(String[] args) {
		Inherite1 i3=new Inherite2();     //dynamic dispatch
		System.out.println(i3.a);
		System.out.println(i3.b);
	//	System.out.println(i3.c);    //cannot access
		  i3.method1();
	      i3.method2();
	      //i3.method3();
	        
	}
	public static void main2(String[] args) {
		
		Inherite1 i1=new Inherite1();           //created object of parent class
		System.out.println("a     =   "+i1.a);	
		System.out.println("b     =   "+i1.b);
	//	System.out.println("c     =   "+i1.c);   object is created of parent class and it cannot access
		                                         //attributs of child class
        i1.method1();
        i1.method2();
	}
	public static void main1(String[] args) {
	 
		Inherite2 i2=new Inherite2();    //created object of child class 
		System.out.println("a    =  "+i2.a);
		System.out.println("b    =  "+i2.b);
		System.out.println("c    =  "+i2.c);
		 i2.method1();
		 i2.method2();
		 i2.method3();
		}
	
}
