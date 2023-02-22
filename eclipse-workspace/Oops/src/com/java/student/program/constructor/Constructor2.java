package com.java.student.program.constructor;

public class Constructor2 {
	
	private String name;
	private int empid;
	
	public Constructor2() {

		this.name=name;
		this.empid=empid;
	}
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void printrecord() {
		
		System.out.println(name);
		System.out.println(empid);

	}

	public static void main(String[] args) {
		
		Constructor2 c2 = new Constructor2();
		 
		
		c2.setEmpid(36262);
		c2.setName("vijay");
		
	//	String name = c2.getName();
		//System.out.println("name          :      " +Name);
		System.out.println("name          :      " +c2.getName());
		
		int Empid = c2.getEmpid();
		System.out.println("Empid         :      " +Empid);
	}

}
