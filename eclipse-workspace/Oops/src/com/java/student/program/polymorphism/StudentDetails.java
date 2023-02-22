package com.java.student.program.polymorphism;

import java.util.Scanner;

public class StudentDetails {
	
	String name;
	int rollNo;
	long mobNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	void getStudentDetail(String name,int rollNo,long mobNo) {
		System.out.println("student name         :     "+name);
		System.out.println("student roll no      :     "+rollNo);
		System.out.println("student mobile no    :     "+mobNo);
	}
	String getStudentDetail(String name,int rollNo,String city) {
		System.out.println("student name         :     "+name);
		System.out.println("student roll no      :     "+rollNo);
		System.out.println("student mobile no    :     "+city);
		return "studentInfo";
	}
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student name");
		String name=sc.next();
		System.out.println("enter the student roll no");
		int rollNo=sc.nextInt();
		System.out.println("enter the student mobile number");
		long mobNo=sc.nextLong();
		
	//	System.out.println("enter the student name");
	//	String name=sc.next();

	//	sd.getStudentDetail(null, 0, 0);
	    sd.setName(name);
		sd.setRollNo(rollNo);
		sd.setMobNo(mobNo);
		
		System.out.println(sd.getName());
		System.out.println(sd.getRollNo());
		System.out.println(sd.getMobNo());

 		//sd.getStudentDetail(null, 0, null);
	}
}
