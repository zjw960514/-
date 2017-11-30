package com.situ.cashmachine;

import java.util.Scanner;

public class Print extends Input {
	public static void main(String[] args) {
		while(true){
			System.out.println("请输入要操作的选项：");
			Scanner inputXuanXiang = new Scanner(System.in);
			System.out.println("1.存款");
			System.out.println("2.取款");
			System.out.println("3.查询余额");
			System.out.println("0.退出程序");
			int nextInt = inputXuanXiang.nextInt();
			
			Input input = new Input();
			while (true) {
				if (nextInt != 0 && nextInt!= 1 && nextInt!= 2 && nextInt!= 3 )
//				if(nextInt <0 && nextInt>3)
				{
				System.out.println("非法错误！请重新输入。");
				break;
				}
			
			switch (nextInt) {
			case 1:
				System.out.println("请输入存款金额：");
				int cunKuanJine = inputXuanXiang.nextInt();
				double cunKuan = input.CunKuan(cunKuanJine);
				System.out.println("本次存入：" + cunKuanJine + "元，" + "共计" + cunKuan + "元");
				input.setSum(cunKuan);
				break;
			case 2:
				System.out.println("请输入取款金额：");
				int quKuanJine = inputXuanXiang.nextInt();
				input.QuKuan(quKuanJine);
				break;
			case 3: 
				System.out.println(input.sum);
			default:
				break;
			}
			break;
			
			}
		}
	
	}
}
