package com.java.student.program.constructor;

public class ConstructorChainning {

 	String name;
	int rollno;
	String subject; 
	
	public ConstructorChainning() {
		
        this("ram", 11, "maths");   //constructor chainning
    }
	
	public ConstructorChainning(String name,int rollno,String subject) {

		this.name=name;
		this.rollno=rollno;
		this.subject=subject;		
 	}
	
//	public ConstructorChainning1() {
//
//		this.name="rahul";
//		this.rollno=12;
//		this.subject="Math";
//	}
	
	
	public void print() {
		
		System.out.println("name         :      " +name);
		System.out.println("rollno       :      " +rollno);
		System.out.println("subject      :      " +subject);
	}

	public static void main(String[] args) {
		
		ConstructorChainning cc = new ConstructorChainning();  
		cc.print();
	}
	
	public static void main1(String[] args) {
		
		ConstructorChainning cc = new ConstructorChainning("shailesh",22,"English");  
		cc.print();
	}

	 
}