package com.test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test11_28_List_Set  {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("张是");
		list.add("张是三");
		list.add("张三对对对");
		list.add("张啊啊啊啊三");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("=============");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		
		System.out.println("=============");
		
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			System.out.println(string);
		}
		
		System.out.println("==============");
		Set<String> set = new HashSet<>();
		set.add("dddd");
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println("--------------------");
		
		Student set2 = new Student(12," zhangsan");
		Student set3 = new Student(121," zhangaasan");
		Student set4 = new Student(122," zhanddgsan");
		Student set5 = new Student(412," zhadngsan");
		Student set6 = new Student(132," zhandssgsan");
		Set<Student> students = new HashSet<Student>();
		students.add(set2);
		students.add(set3);
		students.add(set4);
		students.add(set5);
		students.add(set6);
		for (Student student : students) {
			System.out.println(student.name);
		}
	}
	
}
