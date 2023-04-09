package com.java.program.string;

import java.util.Arrays;

//anagram - compare two string and check length of character and character same
//diffrent charactor sequence are allowed

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "Grab";
		String str2 = "Brag";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			System.out.println("Both string is not anagram");
		}
		else {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2) == true) {
			System.out.println("String are anagram");
		}
		else {
			System.out.println("String is not anagram");
		}

		}
		
}
	//anagram
	public static void main1(String[] args) {
		
		String str1 = "Karan";
		String str2 = "naraK";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			
			System.out.println("String is not anagram");	

		}
		else {
			char ch1[] = str1.toCharArray();
			char ch2[] = str1.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2) == true) {
				System.out.println("String is anagram");
			}
			else {
				System.out.println("String is not anagram");
			}
		}		
	}
}
