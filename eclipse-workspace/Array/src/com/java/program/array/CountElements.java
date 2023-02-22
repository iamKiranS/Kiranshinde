package com.java.program.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElements {

	public static void main(String[] args) {

		int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			}
		}
		System.out.println(count);

		List<Integer> list = Arrays.asList(0, 0, 0, 0, 1, 1, 1, 1);
		Long newCount = list.stream().map(s -> s + " ").filter(s -> s.startsWith("1")).collect(Collectors.counting());
		System.out.println(newCount);

		int number = 00001111;
		int temp = 1;
		while (number != 0) {
			temp++;
			number = number / 10;
		}
		System.out.println(temp);
	}
}
