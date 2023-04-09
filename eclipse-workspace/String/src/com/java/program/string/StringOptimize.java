package com.java.program.string;


// string optimization
public class StringOptimize {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++) {
			String str1 = "India";
			String str2 = "India";
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime+ " ms ");
		
	    long startTime1 = System.currentTimeMillis();
	    for(int i=0;i<1000;i++) {
	    	String s = new String("India");
	    }
	    long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-startTime1+ " ms ");

	}

	
}
