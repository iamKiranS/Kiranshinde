package com.java.program.string;

// write a java program to count word from string 

public class StringWordCount {

	public static void main(String[] args) {

		String str = "Java is platform idependent language";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				count++;
			}

		}
		System.out.println(str + "   " + count);
	}
}
