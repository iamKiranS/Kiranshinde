package com.java.program.string;

public class StringMethod {

	public static void main9(String[] args) {
		// reverse String
		StringBuffer name = new StringBuffer("kiran");
		System.out.println(name.reverse());
	}
	public static void main(String[] args) {
		//substring
		String name = "Kiran";
		System.out.println(name.substring(3));
	}
	public static void main7(String[] args) {
		//equal - it check the content of two object
		String name = "Kiran";
		String name1 = "Kiran";
		System.out.println(name.equals(name1));
	}
	public static void main6(String[] args) {
		//charAt()  - used to find character of perticular index number
		String name = "Kiran";
 		System.out.println(name.charAt(3));
 	}
	public static void main5(String[] args) {
		//concat  -which is used to connect two words
		String firstname = "Kiran";
		String secondname = "Shinde";
		
		String name = firstname.concat(secondname);
		System.out.println(name);
	}
	public static void main4(String[] args) {
		//trim()
		String name = "     Kiran shinde "; //it remove starting and ending space 
		System.out.println(name.trim());//of characters
	}
	public static void main3() {
		//length
		String name = "My name is kiran shinde";
		System.out.println(name.length());
		//space are also count
	}
	public static void main2(String[] args) {
		//uppercase 
		String name = "kiran";
		System.out.println(name.toUpperCase());
	}
	public static void main1(String[] args) {
		
		String name = "KIRAN";
		System.out.println(name.toLowerCase()); //capital letter convert into samll
 	}
}
