package com.test;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要判断的年份");
		int score = input.nextInt();
		while(score < 0 || score >12){
			System.out.println("请重新输入！");
			System.out.println("请重新输入需要判断的年份！");
			score = input.nextInt();
		}
		if(score % 4 ==0 && score % 100 !=0 
				|| score % 400 == 0){
			System.out.println("请输入需要判断的月份：");
			int mouth = input.nextInt();
			if(mouth == 2){
				System.out.println("本月是29天");
			}else{
				switch (mouth) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("这个月份31天");
					break;
				default:
					System.out.println("这个月份30天");
				}
			}
		}else{
			System.out.println("请输入需要判断的月份：");
			int mouth = input.nextInt();
			if(mouth == 2){
				System.out.println("本月是28天");
			}else{
				switch (mouth) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("这个月份31天");
					break;
				default:
					System.out.println("这个月份30天");
				}
			}
		}
	}
		
}
