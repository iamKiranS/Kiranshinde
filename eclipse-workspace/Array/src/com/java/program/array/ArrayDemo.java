package com.java.program.array;

public class ArrayDemo {

    public static void printArray(int[] arr) {
		System.out.println("no of array element is      :    "+arr.length);
        for(int i=0;i<arr.length;++i) {
        	System.out.println(arr[i]);
        }
    }
	public static void main(String[] args) {
		int arr[] = new int[] {10,45,67,99};
		ArrayDemo.printArray(arr);
	}
	
	public static void main3(String[] args) {
		int array[] = new int[] {10,74,33,44};
		
		for(int element : array){   //forword only and read only loops
			System.out.println(element);
		}
	}
	
	public static void main2(String[] args) {
		int arr[] = new int[] {10,20,30};
		
		System.out.println(arr[3]);    //ArrayOutOfBoundexception
	}
	
	public static void main1(String[] args) {
		
		int arr[] = new int[] {10,20,30};
        //if you do not declare size of array then it is mandtory to initialize variable
		
		System.out.println("Length of array element is   :   "+arr.length);
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);	
 		}
		System.out.println("\nfirst element     :   "+arr[0]);
        System.out.println("second element      :   "+arr[1]);
        System.out.println("third element       :   "+arr[2]);

 	}
}
