package com.java.program.encapsulation;

//print the one example of encapsulation

class Employee {
	// by making field as private we can achieve the data hiding
	// by data hiding we can achieve the encapsulation
	private String empname;
	private int empid;
	private float empsalary;
	private long empmob;
	private String empvillage;

	// generated the getter and setter for access the private data members
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}

	public long getEmpmob() {
		return empmob;
	}

	public void setEmpmob(long empmob) {
		this.empmob = empmob;
	}

	public String getEmpvillage() {
		return empvillage;
	}

	public void setEmpvillage(String empvillage) {
		this.empvillage = empvillage;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Employee emp = null; // local reference variable
		emp = new Employee();
		emp.setEmpname("Vaibhav");
		emp.setEmpid(111);
		emp.setEmpsalary(25000);
		emp.setEmpmob(9488488831l);
		emp.setEmpvillage("Baramati");

		System.out.println("EmpName          :     " + emp.getEmpname());
		System.out.println("EmpId            :     " + emp.getEmpid());
		System.out.println("EmpSalary        :     " + emp.getEmpsalary());
		System.out.println("EmpMob           :     " + emp.getEmpmob());
		System.out.println("EmpVillage       :     " + emp.getEmpvillage());

	}

}
