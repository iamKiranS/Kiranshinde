package com.java.program.serialization;

import java.io.Serializable;

//serialization - The process of storing state of object into file,
  //is called serialization
       
public class Employee implements Serializable {

	String empName;
	int empId;
	float empSalary;
	String empCity;
	

	public Employee(String empName, int empId, int empSalary, String empCity) {
	this.empName=empName;
	this.empId=empId;
	this.empSalary=empSalary;
	this.empCity=empCity;
	
   }
}