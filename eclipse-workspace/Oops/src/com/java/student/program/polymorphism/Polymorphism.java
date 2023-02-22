package com.java.student.program.polymorphism;
//to create the method overloading

public class Polymorphism {
	
	public void method(int a) {          //create a one method 
		System.out.println(a);
	}
	
	public void method(int a,int b) {             // diff number agrs
		System.out.println(a+"       "+b);
	}
	
	public void method(String s) {               // diff type args
		System.out.println(s);
	}
	
	public void method(int a,String s) {          //change sequence of args
		System.out.println(a+"      "+s);
	}
	
	public void method(String s,int a) {
		System.out.println(s+"      "+a);
	}
	
	public static void main(String[] args) {

		Polymorphism pm = new Polymorphism();
		pm.method(19);
		pm.method(13,11);
		pm.method("Kiran");
		pm.method(19,"Palasmandal");
		pm.method("Solapur",11);
		//pm.method(19,11);
		pm.main(22);
      
       }
	
        public  void main(int b) {
        	
        	System.out.println("11");
        }
}
