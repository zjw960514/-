package com.test;

import java.util.Scanner;

public class Big_Small_Game {
	public static void main(String[] args) {
		// int random = (int) (Math.random() * 1000 + 1);
		// System.out.println(random);
		// System.out.println("请输入您所给出的答案！");
		// Scanner input = new Scanner(System.in);
		// int score = input.nextInt();
		Scanner scanner = new Scanner(System.in);
		int num = (int) (Math.random() * 1000 + 1);
		System.out.println(num);
		System.out.println("随机您要猜的数字");
		int receive;
		int count = 1;
		do {
			receive = scanner.nextInt();
			if (receive == 0) {
				System.out.println("退出");
				count++;
				return;
			}
			if (receive > num) {
				System.out.println("大了！");
				count++;
			} else if (receive < num) {
				System.out.println("小了！");
				count++;}
			 else {
				 break;
			}
		} while (true);
		System.out.println("猜对了！！" + "你使用次数：" + count + "幸运数字：" + num);

	}
}