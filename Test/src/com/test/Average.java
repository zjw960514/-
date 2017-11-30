package com.test;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生的个数");
		int studentNum = input.nextInt();
		int[] studentArray = new int[studentNum];
		for(int j = 1 ; j < studentArray.length -1 ; j++){
			System.out.println("请输入"+j+"学生成绩");
			studentArray[j] = input.nextInt();
		}
		double sum = 0;
		for (int i = 0; i < studentArray.length; i++) {
			sum += studentArray[i];
		}
		System.out.println(studentNum + "个学生的平均成绩是：" + sum / studentNum);
	}

}
