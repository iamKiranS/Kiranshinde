package com.java.program.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	String studentName;
	int studentRollNo;
	String city;

	public Student(String studentName, int studentRollNo, String city) {
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.city = city;
	}

}
