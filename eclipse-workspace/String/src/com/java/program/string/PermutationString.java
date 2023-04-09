package com.java.program.string;

public class PermutationString {

	private static void generatePermutations(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = swapString(str, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutations(str, start + 1, end);
				// Backtracking and swapping the characters again.
				str = swapString(str, start, i);
			}
		}
	}

	private static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	public static void main(String[] args) {

		String str = "ABC";
		int len = str.length();
		System.out.println("permutations are");
		generatePermutations(str, 0, len);
	}
}
