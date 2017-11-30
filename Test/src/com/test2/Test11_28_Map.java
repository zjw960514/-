package com.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test11_28_Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("zhangsan", "13");
		map.put("zhangsa", "15");
		map.put("zhang", "13");
		String value1 = map.get("zhangsa");
		System.out.println(value1);
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("姓名：" + key + "年龄" + value);
		}
		
		 ArrayList<String> arrayList = new ArrayList<String>();
		System.out.println("------------------");
		
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			String value = map.get(string);
			System.out.println(value + keySet);
		}
		
		System.out.println("==============");
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			String value = map.get(string);
			System.out.println(value);
		}
		
		System.out.println("------");
		String string = Integer.toString(66);
		System.out.println(string);
		
		
		System.out.println("======================");
		Student student1 = new Student(56, "zjw");
		Student student2 = new Student(56, "zjw");
		Student student3 = new Student(56, "zjw");
		Student student4 = new Student(56, "zjw");
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		Object[] array = hashSet.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}
}
