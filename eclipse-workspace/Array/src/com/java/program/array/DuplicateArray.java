package com.java.program.array;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 20, 20, 30, 40, 90, 40, 50, 50 };

		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
