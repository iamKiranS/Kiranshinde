package com.java.program.array;

public class Test {

	public static int findMinimum(int[] arr, int total) {

		int temp = 0;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[total - 1];
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 7, 8 };

		int num = findMinimum(arr, 6);
		System.out.println(num);
	}

}