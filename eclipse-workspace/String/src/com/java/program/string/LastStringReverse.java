package com.java.program.string;

public class LastStringReverse {

	public static void main(String[] args) {

		String str = "My Name is Kiran Shinde";
		str = str.toLowerCase();
		String newStr = " ";
		String s = " ";

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				break;
			} else {
				newStr = newStr + str.charAt(i);
			}
		}
		System.out.println(str.subSequence(0, str.length() - newStr.length()) + "" + newStr);

	}
}
