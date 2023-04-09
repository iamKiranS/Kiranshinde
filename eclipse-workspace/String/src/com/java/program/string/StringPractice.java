package com.java.program.string;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {

		String str1 = "Cat";
		String str2 = "Act";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Both Sreing is not anagram");
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2) == true) {
				System.out.println("Both string is anagram");
			} else {
				System.out.println("Both string is not anagram");
			}

		}

	}

	public static void main1(String[] args) {

		String str = "My name is Kiran Gorakh Shinde";
		String[] result = str.split(" ");

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
