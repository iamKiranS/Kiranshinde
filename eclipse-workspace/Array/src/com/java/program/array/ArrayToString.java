package com.java.program.array;

import java.util.Arrays;

public class ArrayToString {

	public static void main1(String[] args) {
		
		int array [] = new int[] {1,2,3,5,7,9};  //forword only and read only loop
		for(int element : array){
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[] {102,332,105,234};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		   //by using to string printed array element
	}
}
