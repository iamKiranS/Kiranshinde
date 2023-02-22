
package com.java.program.array;

import java.util.Arrays;

public class LargestNumber {

	public static int getLargestNum(int arr[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[total - 4];
	}

	public static void main(String[] args) {

		int arr[] = { 12, 21, 51, 61, 11, 32, 98 };

		System.out.println(" 4th largest number is    >>  " + getLargestNum(arr, 7));

	}
	/*
	 * public static int getLargestNum(int arr[],int total) { Arrays.sort(arr);
	 * return arr[total-2];
	 * 
	 * } public static void main(String[] args) {
	 * 
	 * int arr[] = new int[] {50,30,40,10,20};
	 * 
	 * System.out.println("second largest number is     >>   "+getLargestNum(arr,5))
	 * ; }
	 * 
	 */
}
