package com.java.program.string;

public class ReverseString {

	public static void main2(String[] args) {

		String str = "Java";

		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Baramati");
		String str = "Baramati";
		int s = sb.capacity();
		System.out.println(s);

		System.out.println("City             >>   " + str);
		System.out.println("Reversed name    >>   " + sb.reverse());
	}

	public static void main1(String[] args) {

		String name = "Kiran";
		String reversestr = "";

		for (int i = name.length() - 1; i >= 0; --i) {
			reversestr = reversestr + name.charAt(i);
		}
		System.out.println(reversestr);
	}
}
