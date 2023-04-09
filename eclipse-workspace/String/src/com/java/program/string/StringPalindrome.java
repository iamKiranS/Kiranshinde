package com.java.program.string;

public class StringPalindrome {

	public static void main(String[] args) {

		String string = "Kayak";
		boolean str = true;
		string = string.toLowerCase();

		for (int i = 0; i <= string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				str = false;
				break;
			}
		}
		if (str) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
