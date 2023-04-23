package com.cgs.task.calculator;

public abstract class CalculatorLogic {

	public static int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
 	}

	protected static int substraction(int num1, int num2) {
		int sum = num1 - num2;
		return sum;
	}

	protected static int multiplication(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}

	protected static int division(int num1, int num2) {
		int sum = num1 / num2;
		return sum;
	}

}
