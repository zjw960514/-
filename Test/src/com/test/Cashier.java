package com.test;

import java.security.PublicKey;
import java.util.Scanner;

import sun.applet.Main;

public class Cashier {

	public void cashier() {
		/*
		 * 1����дһ������̨�տ����if ��������----���ۡ���������� �������----Ӧ�ս����� ʹ��double���ͱ���
		 * 
		 * 2�����ܼ�>=500ʱ������
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("��������Ʒ����");
		double price = input.nextDouble();
		System.out.println("��������Ʒ����");
		double number = input.nextDouble();
		double SPamount = price * number;
		if (SPamount >= 500) {
			System.out.println("�������ѣ�" + SPamount * 0.8 + "Ԫ");
			System.out.println("������ʵ�ս��");
			double SJamount = input.nextDouble();
			while (SJamount < SPamount * 0.8) {
				System.out.println("�������,������������!");
				SJamount = input.nextDouble();
			}
			while (SJamount == SPamount * 0.8) {
				break;
			}
			System.out.println("Ӧ���㣺" + (SJamount - SPamount * 0.8) + "Ԫ"
					+ "/r" + "лл�ݹ�");
		} else {
			System.out.println("�������ѣ�" + SPamount + "Ԫ");
			System.out.println("������ʵ�ս��");
			double SJamount = input.nextDouble();
			while (SJamount < SPamount * 0.8) {
				System.out.println("�������,������������!");
				SJamount = input.nextDouble();
				break;
			}
			System.out.println("Ӧ���㣺" + (SJamount - SPamount * 0.8) + "Ԫ"
					+ "/r" + "лл�ݹ�");
			System.out.println("����������Խ���");
		}
	}

	public void result() {
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int score = input.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("�ɼ�����");
		} else if (score > 75 && score < 90) {
			System.out.println("�ɼ�����");
		} else if (score > 60 && score <= 75) {
			System.out.println("�ɼ�һ��");
		} else {
			System.out.println("������");
		}
	}

	public static void main(String[] args) {
		Cashier Shou = new Cashier();
		Shou.result();
	}
}