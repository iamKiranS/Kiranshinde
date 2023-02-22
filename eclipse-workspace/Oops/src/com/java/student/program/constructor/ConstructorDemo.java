package com.java.student.program.constructor;

import java.util.Scanner;

public class ConstructorDemo {
	
	String studentName;
	int studentId;
	String subject;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("studentname           :     "+studentName);
		System.out.println("studentid             :     "+studentId);
		System.out.println("subject               :     "+subject);
	}
	
    public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the studentname");
 		cd.setStudentName(sc.nextLine());
		
		System.out.println("enter the studentid");
 		cd.setStudentId(sc.nextInt());
		
		System.out.println("enter the subject");
 		cd.setSubject(sc.next());
		
		cd.print();
	}

	public static void main1(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the studentname");
		String studentName = sc.nextLine();
		cd.setStudentName(studentName);
		
		System.out.println("enter the studentid");
		int studentId = sc.nextInt();
		cd.setStudentId(studentId);
		
		System.out.println("enter the subject");
		String subject = sc.next();
		cd.setSubject(subject);
		
		System.out.println("studentname           :     "+cd.studentName);
		System.out.println("studentid             :     "+cd.studentId);
		System.out.println("subject               :     "+cd.subject);
	}
}
