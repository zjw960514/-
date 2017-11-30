package com.test;

public class Fengzhuang {
	public static void main(String[] args) {
//		int max1=max(3,5);
//		System.out.println(max1);
		MaoPao();
	}

	public static int max(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	public static void MaoPao(){
		int [] array = {1,23,3};
		for(int i = 1 ; i < array.length - 1 ; i++ ){
			for(int j = 0 ; j < array.length - i ; j++   ){
				if(array[j] > array[j + 1]){
					int temp = array[j] ;
					array[j] = array[j + 1];
					array[j + 1] = temp ;
				}
			}
		}
		for(int k = 0; k < array.length ; k++){
			System.out.println(array[k]);
		}
	}
}
