package com.java.student.program.constructor;

public class ConstructorChaining1 {

	private String studentName;
	private int studentId;
	private String subject;
	
	public ConstructorChaining1() {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
	}

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
	/*
	public void printRecord() {
		System.out.println("studentName      :    "+studentName);
		System.out.println("studentId        :    "+studentId);
		System.out.println("subject          :    "+subject);
	}
*/
	public static void main(String[] args) {
		ConstructorChaining1 cc =new ConstructorChaining1();
		cc.setStudentName("amar");
		cc.setStudentId(11);
		cc.setSubject("java");
		//cc.printRecord();
		System.out.println("studentName     :    "+cc.getStudentName());
		System.out.println("studentId       :    "+cc.getStudentId());
		System.out.println("subject         :    "+cc.getSubject());
	}
	 
}
