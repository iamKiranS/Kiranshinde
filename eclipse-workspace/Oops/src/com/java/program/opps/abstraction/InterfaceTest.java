package com.java.program.opps.abstraction;
interface X{
	 
	int num1=10;
	int num4=40;
}
interface Y{
	int num2=20;
	int num4=50;
}
interface Z extends X,Y{
	int num3=30;
 	int num4=60;
}
public class InterfaceTest {
	
	public static void main(String[] args) {
		System.out.println("num1       :    "+Z.num1);
		System.out.println("num2       :    "+Z.num2);
		System.out.println("num2       :    "+Z.num3);
	}

	public static void main2(String[] args) {
		System.out.println("num4      :   "+X.num4);
		System.out.println("num4      :   "+Y.num4);
		System.out.println("num4      :   "+Z.num4);
	}
	public static void main1(String[] args) {
		System.out.println("num1      :   "+X.num1);
		System.out.println("num2      :   "+Y.num2);
		System.out.println("num3      :   "+Z.num3);
	}
}
