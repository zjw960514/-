package com.test;

import java.security.PublicKey;
import java.util.Scanner;

import sun.applet.Main;

public class Cashier {

	public void cashier() {
		/*
		 * 1、编写一个收银台收款程序，if 定义输入----单价、数量、金额 定义输出----应收金额、找零 使用double类型变量
		 * 
		 * 2、当总价>=500时候打八折
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("请输入商品单价");
		double price = input.nextDouble();
		System.out.println("请输入商品数量");
		double number = input.nextDouble();
		double SPamount = price * number;
		if (SPamount >= 500) {
			System.out.println("本次消费：" + SPamount * 0.8 + "元");
			System.out.println("请输入实收金额");
			double SJamount = input.nextDouble();
			while (SJamount < SPamount * 0.8) {
				System.out.println("输入错误,请重新输入金额!");
				SJamount = input.nextDouble();
			}
			while (SJamount == SPamount * 0.8) {
				break;
			}
			System.out.println("应找零：" + (SJamount - SPamount * 0.8) + "元"
					+ "/r" + "谢谢惠顾");
		} else {
			System.out.println("本次消费：" + SPamount + "元");
			System.out.println("请输入实收金额");
			double SJamount = input.nextDouble();
			while (SJamount < SPamount * 0.8) {
				System.out.println("输入错误,请重新输入金额!");
				SJamount = input.nextDouble();
				break;
			}
			System.out.println("应找零：" + (SJamount - SPamount * 0.8) + "元"
					+ "/r" + "谢谢惠顾");
			System.out.println("您好这里可以结账");
		}
	}

	public void result() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int score = input.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("成绩优秀");
		} else if (score > 75 && score < 90) {
			System.out.println("成绩良好");
		} else if (score > 60 && score <= 75) {
			System.out.println("成绩一般");
		} else {
			System.out.println("不及格");
		}
	}

	public static void main(String[] args) {
		Cashier Shou = new Cashier();
		Shou.result();
	}
}