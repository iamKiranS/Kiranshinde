package com.java.program.array;

public class ArraySession {

	public static void main(String[] args) {
		
		int a[][] = {{10,20,30},{22,33,44}};
		try {
			
		for(int i=0;i<3;++i) {
			for(int j=0;j<3;++j) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("\t");
		}
		}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
	}
 	public static void main3(String[] args) {
		
		int result = 0;
		int arr3[] = new int[] {10,11,12,13,14,15,16,17,18,19};
		
		for(int i=0;i<arr3.length;++i) {
			
			result = result + arr3[i];
			
			System.out.println(result);
 
		}
		System.out.println();
		System.out.println("sum of all elements   :    "+result);


		
	}
	public static void main2(String[] args) {
		
		int arr3[] = new int[] {10,11,12,13};
		
		for(int ashwini : arr3) {
         System.out.println(ashwini);
		} 

	}
 	@SuppressWarnings("unused")
	public static void main1(String[] args) {
		
 		int arr[] = new int[2];
  		int []arr1 = new int[3];
 		int[] arr2 = new int[4];
 		
		int arr4[] = {11,22,33,44};
		for(int i=0;i<3;++i) {
			System.out.println(arr4[3]);
			
			for(Integer element : arr4)
				System.out.println(element);
		}
	}
}
