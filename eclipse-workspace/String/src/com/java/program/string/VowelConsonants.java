package com.java.program.string;
//to find total number of vowels and consonants
public class VowelConsonants {

	public static void main(String[] args) {
		
		String str = "Rohit Sharma is best opener in the world";
		int vCount=0,cCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
			vCount++;
		}
			 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
				 cCount++;
			 }
			
	    }
		System.out.println(vCount);
		System.out.println(cCount);

	}
}
