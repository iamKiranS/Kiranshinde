package com.java.program.string;

//write a java program to find position of capital letters from string 
public class CapitalLetterPosition {

	public static void main(String[] args) {

		String str = "dasSault systemS";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'S') {
				System.out.println(i);
			}
		}

		String A = "Dassault";
		A = "System";

		System.out.println(A);
	}
}
