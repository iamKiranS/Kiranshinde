package com.java.program.string;

public class CountPunctuations {

	static {
		System.out.println("Hii");
	}
	public static void main1(String[] args) {
		
		String str = "Rohit, Rohit, Rohit!!!";
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==',' || str.charAt(i)=='!') {
				count++;
			}
			str=str.replaceAll("[,!]", "");
		}
		System.out.println(count);
		System.out.println(str);

	}
	public static void main(String[] args) {
		
		String str = "'Rohit is opener',classic!,Dangerous!";
		int count=0;
		String str1="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ',' || str.charAt(i) == '!') {
				count++;
			}
			  str1=str.replaceAll("[',!]", " ");
		}
		System.out.println(count);
		System.out.println(str);
		System.out.println(str1);
	}
}
