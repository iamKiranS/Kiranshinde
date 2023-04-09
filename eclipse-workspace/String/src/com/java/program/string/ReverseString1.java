package com.java.program.string;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void main2(String[] args) {

		String str = "My name is Kiran";
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr + str.charAt(i);
		}
		System.out.println(newStr);

	}

	public static void main1(String[] args) {

		String name = "Indapur";
		String reverseString = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseString = reverseString + name.charAt(i);
		}
		System.out.println(reverseString);
	}
}
