package com.situstudentmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Student {
	private void add() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("请输入要添加的学生姓名：");
			System.out.println("结束请按0：     谢谢！");
			System.out.println();
			System.out.println();
			System.out.println();
			Scanner input = new Scanner(System.in);
			List<String> studentList = new ArrayList();
			if (input.nextInt() == 0) {
				break;
			} else {
				studentList.add(input.next());
			}
			for (String string : studentList) {
				System.out.print(string);

			}
		}
	}

	public static void main(String[] args) {
		Manager aManager = new Manager();
		aManager.add();
	}
}
