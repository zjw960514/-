package com.test;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class T11_8 {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("请输入你的成绩");
		int saa=sa.nextInt();
		int hi=saa/10;
		switch(hi){
		case 10:
			System.out.println("你是满分NO.1，然后 滚犊子");
		case 9:
			System.out.println("ppppppppp");
		case 8:
			System.out.println("ppppppppp");
		case 7:
			System.out.println("ppppppppp");
		case 6:
			System.out.println("合格");
		case 5:
			System.out.println("不合格");
		case 4:
			System.out.println("不合格");
		case 3:
			System.out.println("不合格");
		case 2:
			System.out.println("不合格");
		case 1:
			System.out.println("不合格");
			default:
				System.out.println("输入错误，请重新输入");
		
			}
		/**
		 * 第一题
		 */
//		int a =0;
//		for(int i=0;i<=100;i++){
//			if(i%10==3){
//				continue;
//			}
//			a=a+i;
//		}
//		System.out.println(a);
		/**
		 * 第二滴
		 */
//		for(int a=1;a<=5;a++){
//			for(int b=1;b<=2*a-1;b++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		/**
		 * 三角形
		 */
//		for(int i=1;i<=5;i++){
//			for(int c=4;c>=i;c--)
//			System.out.print(" ");
//			for(int n=1;n<=2*i-1;n++)
//			System.out.print("*");
//			System.out.println();
//		}
		
		/**
		 * 第四题
		 */
//		for(int i=-100;i<=100;i++){
//		if(i==0){
//			continue;
//		}else
//			if(i%2==0){
//				System.out.println(i+"偶数是：");
//			}else{
//				System.out.println(i+"奇数是：");
//			}
//		}
		
		
	}
	
}
