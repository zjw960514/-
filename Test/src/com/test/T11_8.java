package com.test;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class T11_8 {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("��������ĳɼ�");
		int saa=sa.nextInt();
		int hi=saa/10;
		switch(hi){
		case 10:
			System.out.println("��������NO.1��Ȼ�� ������");
		case 9:
			System.out.println("ppppppppp");
		case 8:
			System.out.println("ppppppppp");
		case 7:
			System.out.println("ppppppppp");
		case 6:
			System.out.println("�ϸ�");
		case 5:
			System.out.println("���ϸ�");
		case 4:
			System.out.println("���ϸ�");
		case 3:
			System.out.println("���ϸ�");
		case 2:
			System.out.println("���ϸ�");
		case 1:
			System.out.println("���ϸ�");
			default:
				System.out.println("�����������������");
		
			}
		/**
		 * ��һ��
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
		 * �ڶ���
		 */
//		for(int a=1;a<=5;a++){
//			for(int b=1;b<=2*a-1;b++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		/**
		 * ������
		 */
//		for(int i=1;i<=5;i++){
//			for(int c=4;c>=i;c--)
//			System.out.print(" ");
//			for(int n=1;n<=2*i-1;n++)
//			System.out.print("*");
//			System.out.println();
//		}
		
		/**
		 * ������
		 */
//		for(int i=-100;i<=100;i++){
//		if(i==0){
//			continue;
//		}else
//			if(i%2==0){
//				System.out.println(i+"ż���ǣ�");
//			}else{
//				System.out.println(i+"�����ǣ�");
//			}
//		}
		
		
	}
	
}
