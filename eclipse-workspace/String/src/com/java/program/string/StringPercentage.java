package com.java.program.string;

public class StringPercentage {

	private static void findPercentage(String string) {

		int uppercas = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i))) {
				uppercas++;
			}
		}
		double percentageofuppercase = (uppercas * 100) / string.length();
		System.out.println("percentage of uppercase letter >> " + percentageofuppercase + "%");
	}

	public static void main(String[] args) {
		System.out.println("hii");
		findPercentage("My namE Is KiranN ");
	}

}
