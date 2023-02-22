package com.java.program.array;

//write a java program to print odd position of element
public class OddPos {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<num.length;i=i+2) {
			
			System.out.println(num[i]);
		
 		}
	}
}
