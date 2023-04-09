package com.java.program.string;

//find out duplicate from string in java

public class Duplicate {

	public static void main(String[] args) {

		System.out.println("l");
		String str = "Java is object oriented pogramming language";
		int count = 0;
		char[] newStr = str.toCharArray();

		for (int i = 0; i < newStr.length; i++) {
			count = 1;
			for (int j = i + 1; i < newStr.length; j++) {
				if (newStr[i] == newStr[j] && newStr[i] != ' ') {
					count++;
					newStr[j] = '0';
				}
			}
			if (count > 1 && newStr[i] != '0') {
				System.out.println(newStr[i]);
			}
		}

	}
}
