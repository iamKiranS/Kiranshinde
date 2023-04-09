package com.java.program.string;

import java.util.Scanner;

public class VcountCcount {

	public static void main(String[] args) {

		int Ccount = 0;
		int Vcount = 0;

		String str = "Games Gosling is the father of java language";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				Vcount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				Ccount++;
			}
		}
		System.out.println(Vcount);
		System.out.println(Ccount);
	}

	public static void main1(String[] args) {

		int Vcount = 0;
		int Ccount = 0;

		String str = "my name is shinde kiran";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				Vcount++;
			}
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				Ccount++;
			}
		}
		System.out.println(Vcount);
		System.out.println(Ccount);
	}
}
