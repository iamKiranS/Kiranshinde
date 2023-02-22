package com.java.program.encapsulation;

import java.util.Scanner;

class StudentInfo {

	private String studentName;
	private int studentid;
	private long studentmob;
	private String village;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public long getStudentmob() {
		return studentmob;
	}

	public void setStudentmob(long studentmob) {
		this.studentmob = studentmob;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

}

public class Encapsulation1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the studentname");
		String name = sc.next();
		System.out.println("enter the studentid");
		int id = sc.nextInt();
		System.out.println("enter the studentmob");
		long mob = sc.nextLong();
		System.out.println("enter the village");
		String village = sc.next();

		StudentInfo sf = new StudentInfo();
		// sf.setStudentName(name);
		sf.setStudentid(id);
		sf.setStudentmob(mob);
		sf.setVillage(village);

		System.out.println(sf.getStudentName());
		System.out.println(sf.getStudentid());
		System.out.println(sf.getStudentmob());
		System.out.println(sf.getVillage());

	}
}
