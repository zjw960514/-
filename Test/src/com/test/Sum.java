package com.test;

public class Sum {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(array[i]);
			}
			System.out.println();
		}
	}
	
}
