package com.java.program.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElement {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 20, 30, 30, 40, 40, 50, 50 };

		Set<Integer> set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		System.out.println(set);

	}
}
