package com.test;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ�жϵ����");
		int score = input.nextInt();
		while(score < 0 || score >12){
			System.out.println("���������룡");
			System.out.println("������������Ҫ�жϵ���ݣ�");
			score = input.nextInt();
		}
		if(score % 4 ==0 && score % 100 !=0 
				|| score % 400 == 0){
			System.out.println("��������Ҫ�жϵ��·ݣ�");
			int mouth = input.nextInt();
			if(mouth == 2){
				System.out.println("������29��");
			}else{
				switch (mouth) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("����·�31��");
					break;
				default:
					System.out.println("����·�30��");
				}
			}
		}else{
			System.out.println("��������Ҫ�жϵ��·ݣ�");
			int mouth = input.nextInt();
			if(mouth == 2){
				System.out.println("������28��");
			}else{
				switch (mouth) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("����·�31��");
					break;
				default:
					System.out.println("����·�30��");
				}
			}
		}
	}
		
}
