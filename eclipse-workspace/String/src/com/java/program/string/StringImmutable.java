package com.java.program.string;

public class StringImmutable {

	public static void main(String[] args) {
//		
//		String str = "Java";
//		str=str.concat("programm");
//		System.out.println(str);
//		
//	
//		
//		String s = new String("python");
//		String st = "C++";
//		
//		System.out.println(st.compareTo(str));
//		
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "C";
		String s4 = "C";
		String s5 = new String("Java");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
	}
}
