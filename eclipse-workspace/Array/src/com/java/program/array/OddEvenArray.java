package com.java.program.array;

public class OddEvenArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("original element      >>   ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("even elements are     >>   ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("odd elements are      >>   ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			System.out.print(arr[i]+" ");
			}
		}
	}
}
