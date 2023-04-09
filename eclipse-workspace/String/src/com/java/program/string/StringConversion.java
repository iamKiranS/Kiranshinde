 package com.java.program.string;

//conversion uppercase to lowercase and wiseversa
public class StringConversion {

	public static void main(String[] args) {

		String str = "Kiran Shinde";
		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}

		}
		System.out.println(sb);
	}

	public static void main1(String[] args) {

		String str = "Great Power";
		StringBuffer newStr = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(newStr);
	}
}
