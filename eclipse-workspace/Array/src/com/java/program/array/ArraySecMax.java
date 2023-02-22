package com.java.program.array;

public class ArraySecMax {

	public static int getSecondMax(int[] a, int total) {

		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];

	}

	public static void main(String[] args) {

		int a[] = { 11, 22, 55, 77, 55, 88, 44, 32, 44, 74, 84, 85, 86 };
		System.out.println(getSecondMax(a, 13));
	}
}
