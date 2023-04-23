package com.cgs.task.calculator;

public class CalculatorEntity {

	private int num1;
	private int num2;

	public CalculatorEntity(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public CalculatorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CalculatorEntity [num1=" + num1 + ", num2=" + num2 + "]";
	}

}
