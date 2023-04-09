package com.java.program.string;

public class RotationsString {

	private static boolean checkStringRotations(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		String s3 = str1 + str2;
		if (s3.contains(str1)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		String str1 = "Ravan";
		String str2 = "Ranav";

		if (checkStringRotations(str1, str2)) {
			System.out.println("rotation");
		} else {
			System.out.println("not rotation");
		}
	}

}
