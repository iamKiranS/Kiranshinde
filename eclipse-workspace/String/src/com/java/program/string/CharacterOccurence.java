package com.java.program.string;

public class CharacterOccurence {

	public static void main(String[] args) {

		String str = "My Name is Kiran";
		char ch = 'a';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " " + count);
	}
}
