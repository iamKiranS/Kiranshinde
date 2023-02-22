package com.java.program.array;
//array - 

//array is linear collection of semillar data type which has contineos memory location

import java.util.Scanner;

@SuppressWarnings("unused")
public class Array {

	public static void main(String[] args) {

		int a[];
		a = new int[2];
		for (int newA : a) {
			System.out.println(newA);
		}
	}

	public static void main7(String[] args) {

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main5(String[] args) {

		int array1[] = new int[] { 10, 20 };
		int array2[] = new int[] { 10, 20, 30, 40 };
		int array3[] = new int[] { 10, 20, 30, 40, 50, 60 };

		printArray(array1);
		printArray(array2);
		Array.printArray(array3);
	}

	public static void main9(String[] args) {

		int arr[] = new int[] { 90, 20, 30, 40 };

		for (int element : arr) // trick -- foreach element in array
								// forword only and read only loop
			System.out.println(element); // another way to print all array element
	}

	/*
	 * static Scanner sc = new Scanner(System.in); public static void
	 * acceptarray(int[]arr) { if(arr != null) { for(int
	 * index=0;index<arr.length;++index) {
	 * System.out.println("arr["+index+"]     :   "); arr[index]=sc.nextInt(); } } }
	 * private static void printarray(int[] arr) { if(arr != null) { for(int
	 * index=0;index<arr.length;++index) { System.out.println(arr[index]); } } }
	 * public static void main(String[] args) { int arr[] = new int[3];
	 * Array.acceptarray(arr); Array.printarray(arr); }
	 */
	public static void main3(String[] args) {
		int arr[] = new int[3];
		for (int index = 0; index < 3; ++index) {
			System.out.println(arr[index]);
		}
	}

	public static void main2(String[] args) {
		int arr[] = new int[-3]; // negativearrayexception
	}

	public static void main1(String[] args) {

		@SuppressWarnings("unused")
		int arr[] = new int[3]; // instance of array
	}

}
