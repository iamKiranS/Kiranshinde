package com.java.program.string;

public class StringSaperate {

	public static void main(String[] args) {

		String str = "Glass>milk>%water*";
		str = str.replaceAll("[>%*,A-Z]", " ");
		System.out.println(str);
	}
}
