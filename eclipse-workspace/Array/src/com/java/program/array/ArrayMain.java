package com.java.program.array;

public class ArrayMain {

	private static int getSecondMax(int[] b, int total) {

		int temp = 0;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (b[i] > b[j]) {

					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		return b[total - 2];
	}

	public static void main5(String[] args) {

		int b[] = { 1, 2, 34, 6, 7, 888, 76 };
		int secondMaxNum = getSecondMax(b, 7);
		System.out.println(secondMaxNum);
	}

	public static int getMax(int a[], int total) {
		int temp = 0;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];

	}

	public static void main(String[] args) {
		int a[] = { 11, 22, 3, 44, 5, 66, 77, 8 };
		int result = (getMax(a, 8));
		System.out.println(result);
	}

	public static void main2(String[] args) {

		int a[] = new int[] { 12, 3, 44, 55 };

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
	}

	public static void main1(String[] args) {

		int a[] = { 10, 11, 23, 44, 31, 11, 10 };

		System.out.println("Elements of a");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("duplicate elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
