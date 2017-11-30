package com.test;

public class Util {
	public static int max( int [] array) {
		int j = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			if ( j < array [i+1]) {
				j = array [i+1] ;
			}
		}
		return j ;
	}
	
	public static void main(String[] args) {
		int [] a = new int [] {3,2,2,1,4};
		int max = max(a);
		System.out.println(max);
	}

	private Util() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
