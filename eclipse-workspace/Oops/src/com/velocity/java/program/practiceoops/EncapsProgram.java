package com.velocity.java.program.practiceoops;
//encapsulation
public class EncapsProgram {

	private int num1=22;        //by making variable as private ,to achieve encapsulation
	private String s="pune";

	
	
	public int getNum1() {          //use setter-getter method to achieve the encapsulation 
		return num1;           
	}
	public void setNum1(int num1) {
		this.num1 = num1;          //by using this keyword refer to the current class object
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

	 

	     
}

