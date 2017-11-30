package com.test;

import java.util.Scanner;

import org.omg.CORBA.FloatSeqHelper;

import sun.print.resources.serviceui;

public class StudentManage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量");
		int count = scanner.nextInt();
		Student[] students = new Student[count];

		inputStudents(students);

		printStudents(students);

		searchByCoundtion(students);

	}

	private static void searchByCoundtion(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请按照提示输入数字并进行下一次操作 ");
			System.out.println("输入1将按照姓名查询：");
			System.out.println("输入2将按照年龄查询：");
			System.out.println("输入3将按照性别查询：");
			System.out.println("输入0将推出程序");
			int num = scanner.nextInt();

			if (num == 0) {
				System.out.println("退出");
				break;
			}

			switch (num) {
			case 1:
				System.out.println("请输入要查询的名字");
				String NameByName = scanner.next();
				boolean isNameSearchFound = false;
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					String name = student.getName();
					if (NameByName.equals(name)) {
						System.out.println(student);
						isNameSearchFound = true;
					}
				}

				if (isNameSearchFound == false) {
					System.out.println("没有这个姓名的学生。");
				}
				break;

			case 2:
				System.out.println("请输入要查询的年龄");
				int NameByAge = scanner.nextInt();
				boolean isAgeSerchFound = false;
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					int Age = student.getAge();
					if (NameByAge == Age) {
						System.out.println(student);
						isAgeSerchFound = true;
					}
				}

				if (isAgeSerchFound == false) {
					System.out.println("没有这个年龄段的学生。");
				}
				break;

			case 3:
				System.out.println("请输入要查询的性别");
				String NameByGender = scanner.next();
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					String Gender = student.getGender();
					if (NameByGender.equals(Gender)) {
						System.out.println(student);
					}
				}
				break;
			default:
				System.out.println("非法输入");
				break;
			}
		}
	}

	private static void printStudents(Student[] students) {
		for (int j = 0; j < students.length; j++) {
			Student student = students[j];
			System.out.println(student);
		}
	}

	private static void inputStudents(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("请输入学生年龄");
			int age = scanner.nextInt();
			System.out.println("请输入学生性别");
			String gender = scanner.next();
			System.out.println("请输入学生姓名");
			String name = scanner.next();
			Student student = new Student(age, name, gender);
			students[i] = student;
		}
	}
}
