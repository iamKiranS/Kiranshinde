package com.java.program.string;

//string - it is sequence of character
public class StringDemo {

	public static void main(String[] args) {

//		remove white spaces
		String str = "Pune is beautiful city";
//
//		str = str.replaceAll("\\s+", "");
//		System.out.println(str);
//		
		StringBuffer sb = new StringBuffer();
		char[] strArray = str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}
		String finalStr = sb.toString();
		System.out.println(finalStr);

		String s = "200";
		int num = Integer.parseInt(s);
		System.out.println(num);

		int n = 100;
		String s1 = String.valueOf(n);
		System.out.println(s1);
	}

	public static void main2(String[] args) {
		String s1 = "pune";
		String s2 = "city";
		s2 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}

	public static void main1(String[] args) {

		// string literal - those object are stored inside string constant pool
		// scp is memory space of heap segment

		String s1 = "pune";
		String s2 = "pune";

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}

}
