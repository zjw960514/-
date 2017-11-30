package com.test.calculator;

import java.util.Scanner;

public class method extends Calculator {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入您要进行的下一步操作：");
			System.out.println("1.加法运算");
			System.out.println("2.减法运算");
			System.out.println("3.乘法运算");
			System.out.println("4.除法运算");
			System.out.println("0.退出计算器");
			Scanner input = new Scanner(System.in);
			int nextInt = input.nextInt();
			if (nextInt == 0) {
				break;
			}
			switch (nextInt) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3 :
				multi();
				break;
			case 4 :
				div();
				break;
			default:
				System.err.println("非法输入，请重新输入");
				break;
			}
			
		}

	}


	

	
}
