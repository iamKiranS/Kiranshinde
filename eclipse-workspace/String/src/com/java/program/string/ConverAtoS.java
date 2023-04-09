package com.java.program.string;

import java.util.Arrays;

public class ConverAtoS {
	
	public static String convertArrayToString(String[] strArray) {
 
		return Arrays.toString(strArray);
	}

	public static void main(String[] args) {
		
		String[] strArray = {"Kiran", "Shinde", "Natepute"};
		String str = convertArrayToString(strArray);
		
		System.out.println(str);
		
		
		System.out.println(Arrays.toString(strArray));
		
	}

	
}
