 package com.java.program.string;

public class CountNumber {

	public static void main(String[] args) {

		String str = "Kiran shinde";
		System.out.println(str.length()); // 12
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++; // 11
			}
		}
		System.out.println(count);

	}

	public static void main7(String[] args) {

		String str = "Kiran shinde";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 0) {
				count++;
			}
		}
		System.out.println("Total number of words     >>   " + count);
	}
}
