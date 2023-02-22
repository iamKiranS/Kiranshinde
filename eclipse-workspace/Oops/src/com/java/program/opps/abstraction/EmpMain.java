package com.java.program.opps.abstraction;

public class EmpMain extends Employee {

	public EmpMain(String name, int id, float salary) {
		super(name, id, salary);
        setName("kiran");
        setId(35);
        setSalary(63222.3f);
        
	}
	public EmpMain() {
		this("Kiran", 26, 92222.3f);
	}
	public static void main(String[] args) {

		EmpMain e = new EmpMain();
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSalary());

	}
}
