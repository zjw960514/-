package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.omg.CORBA.Object;

public class SanJiao_ShuZi {
	public static void main(String[] args) {
		SanJiao_ShuZi sanjiaoshuzi = new SanJiao_ShuZi();
//		sanjiaoshuzi.daYin_SanJiao_ShuZi();
		statistics_0_9();
	}

	public static void daYin_SanJiao_ShuZi() {
		int[] array = { 1, 3, 5, 6, 7 };
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(array[j]);
			}
			System.out.println();
		}
	}

	public static void statistics_0_9() {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		for (int i = 0; i < score.length; i++) {
		}
	}
}
