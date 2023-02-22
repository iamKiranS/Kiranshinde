package com.java.program.array;

import java.awt.geom.Area;

public class ArraySum {

	public void add(float[] a) {
		float result = 0;
		for (int i = 0; i < a.length; ++i) {
			result += a[i];
		}
		System.out.println("addition of array is      >>    " + result);
	}

	public static void main2(String[] args) {

		float a[] = { 10.26f, 20.00f, 70.10f, 45.70f, 59.90f };

		ArraySum as = new ArraySum();
		as.add(a);
	}

	public static void main1(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 }; // array initialization
		int result = 0;

		for (int i = 0; i < arr.length; ++i) {

			result = result + arr[i]; //
		}
		System.out.println("addition of array        :     " + result);

	}
}
