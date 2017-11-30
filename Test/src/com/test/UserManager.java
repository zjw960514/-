package com.test;

import java.util.Scanner;

public class UserManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户的个数");
		int count = scanner.nextInt();
		User[] users = new User[count];
		for (int i = 0; i < users.length; i++) {
			System.out.println("请输入用户姓名");
			String name = scanner.next();
			System.out.println("请输入用户年龄");
			int age = scanner.nextInt();
			// users[i] = new User(age, name);
			User user = new User(age, name);
			users[i] = user;
		}
		while (true) {
			System.out.println("请按照提示输入数字并进行下一次操作 ");
			System.out.println("输入1将按照姓名查询：");
			System.out.println("输入2将按照年龄查询：");
			System.out.println("输入3将按照性别查询：");
			System.out.println("输入0将推出程序");

			int num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("请输入要查询的名字");
				String nameByname = scanner.next();
				boolean isNameByname = false;
				for (int i = 0; i < users.length; i++) {
					User user = users[i];
					String name = user.getName();
					if (nameByname.equals(name)) {
						System.out.println(user);
						isNameByname = true;
					}
				}

				if (isNameByname = false) {
					System.out.println("没有这个姓名的用户信息");
				}

				break;
			case 2:
				System.out.println("请输入要查询的年龄");
				int nameByName = scanner.nextInt();
				boolean isSearchByAge = false;
				for (int i = 0; i < users.length; i++) {
					User user = users[i];
					int age = user.getAge();
					if (nameByName == age) {
						System.out.println(user);
						isSearchByAge = true;
					} 
					if (isSearchByAge == false) {
						System.out.println("没有这个年龄的人");
					}
				}
			default:
				System.out.println("输入错误，请重新输入！");
			}
		}
	}
}
