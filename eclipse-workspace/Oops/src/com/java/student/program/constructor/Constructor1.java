package com.java.student.program.constructor;

public class Constructor1 {
	
	private String name;
	private int rollno;
	private String subject;
	
//	public Constructor1() {
//		this.name = name;
//		this.rollno = rollno;
//		this.subject = subject;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
public static void main(String[] args ) {
	
	Constructor1 c1 = new Constructor1();
	
	c1.setName("Rohit");
	c1.setRollno(33);
	c1.setSubject("English");
	
	System.out.println("name        :    " +c1.getName());
	System.out.println("rollno      :    " +c1.getRollno());
	System.out.println("subject     :    " +c1.getSubject());

}
	public static void main1(String[] args) {
	
		Constructor1 c1 = new Constructor1();
		
		c1.setName("Rohit");
		c1.setRollno(33);
		c1.setSubject("English");
		
		String name = c1.getName();
		System.out.println("name        :    " +name);
		
		int rollno = c1.getRollno();
		System.out.println("rollno      :    " +rollno);
		
		String subject = c1.getSubject();
		System.out.println("subject     :    " +subject);
		
	}

}
