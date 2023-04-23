package com.cgs.task.calculator;

import java.util.Scanner;

public class Calculator extends CalculatorLogic {

	static {
		System.out.println(".........................");
		System.out.println("Welcome to the calculator");
		System.out.println(".........................\n");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CalculatorEntity c = new CalculatorEntity();
		int num1 = c.getNum1();
		System.out.println("please enter the first number");
		num1 = scanner.nextInt();

		int num2 = c.getNum1();
		System.out.println("please enter the first number");
		num2 = scanner.nextInt();

		int result = 0;
		try {
			System.out.println("Select an operation:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				result = addition(num1, num2);
				System.out.println("result  >>  " + result);
				CalInterface.getAddition();
				break;

			case 2:
				result = substraction(num1, num2);
				System.out.println("result  >>  " + result);
				break;

			case 3:
				result = multiplication(num1, num2);
				System.out.println("result  >>  " + result);
				break;

			case 4:
				result = division(num1, num2);
				System.out.println("result  >>  " + result);

				break;

			case 5:
				System.out.println("exit");
				break;

			default:
				System.out.println("you entered wrong key");
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println(".........................");
		System.out.println("Tnakns for visited.......");
		System.out.println(".........................\n");

	}

}
