package com.java.program.array;

import java.util.Arrays;

public class Shorting {

	public static void method(int[] arr) {
		for (int index = 0; index < arr.length; ++index)
			System.out.println(+arr[index]); // print array element
		System.out.println("\n");
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 30, 20, 10, 50, 40 }; // array initializer

		Shorting.method(arr);

		Arrays.sort(arr); // print element in inceasing order
		Shorting.method(arr);

	}
}