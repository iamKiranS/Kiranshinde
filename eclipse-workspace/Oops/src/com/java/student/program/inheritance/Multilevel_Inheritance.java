package com.java.student.program.inheritance; 
//aveive multilevel inheritance 
          //-inherite attributes of one class to multiple class
class BankDetails{                 //parent class 
	int accountNumber=10101;
	int accbalance=1230000;
	
	void method1() {                       //parent class method
		System.out.println("Account details");
	}
}
class Saving extends BankDetails{     //child class 
	int savingbalance=88200;
	
	void method2() {
		System.out.println("This is saving type account");
	}
}
class Current extends Saving{       //child class
	int currentbalance=77662;      
	
	void method3() {
		System.out.println("This is current type account");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		Current c1=new Current();
		System.out.println("account number        :     "+c1.accountNumber);
		System.out.println("account balance       :     "+c1.accbalance);
		System.out.println("saving balance        :     "+c1.savingbalance);
		System.out.println("current balance       :     "+c1.currentbalance);
		
		c1.method1();
		c1.method2();
		c1.method3();
	}
	
	public static void main1(String[] args) {
		Saving s1=new Saving();
		System.out.println("account balance       >>    "+s1.accbalance);
		System.out.println("saving balance       >>    "+s1.savingbalance);
		//System.out.println("current balance       >>    "+s1.currentbalance); we cannot access
		s1.method1();
		s1.method2();
		//s1.method3();   cannot access

	}
}
