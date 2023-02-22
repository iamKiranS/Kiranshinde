package com.java.program.array;

import java.util.Arrays;

public class ArrayTest {

	public static void main5(String[] args) {
		String array [ ] = new String[] {"Ram","shyam","ajay","vijay"};
		System.out.println(Arrays.toString(array));
	}
	public static void main3(String[] args) {
		
		char array[] = new char[] {'a','b','c','d'};
	    
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);

	}
	public static void main(String[] args) {
		
		float array [] = new float[] {10.5f,20.5f,22.3f};
		for(float element : array) {
			System.out.println(element);
			
		}
		
		System.out.println("\n"+Arrays.toString(array));
		
		System.out.println();
		
		for(int i=0;i<array.length;++i) {
			System.out.println(+array[i]);
		}
	}
	public static void main1(String[] args) {
		
		int array[] = {10,20,30};
		                       //array index always begins with 0
		System.out.println("first element        >>   "+array[0]);
		System.out.println("second element       >>   "+array[1]);
		System.out.println("third element        >>   "+array[2]);
	}
}
