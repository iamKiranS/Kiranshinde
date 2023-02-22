package com.java.program.array;

public class MissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		for (int i = 1; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Missing number is     >>    " + i);
			}
		}
	}
}
