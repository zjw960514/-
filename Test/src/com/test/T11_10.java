package com.test;

import java.util.*;
import java.util.Map.Entry;

public class T11_10 {

	public static void main(String[] args) {
		// 第一题
		List<String> a = new ArrayList<String>();
		a.add("1");//0
		a.add("2");//1
		a.add("3");//
		a.add("4");//2
		a.add("4");//3
		a.add("3");//
		a.add("4");//4
		a.add("2");//5
		// 遍历并删除其中的叫3的同学
		Iterator<String> b = a.iterator();
		while (b.hasNext()) {
			String c = b.next();
			if ("3".equals(c)) {
				b.remove();
			}
		}
		for (String d : a) {
			System.out.print(d);
		}
		// 获取第三个同学的名字
		a.get(2);
		System.out.println();
		// 将刘甜同学添加到集合中
		a.add("刘甜");
		for (String f : a) {
			System.out.print(f);
		}
		System.out.println();
		//5.使用equals方法找出名字相同同学的位置
		List<Integer> i=new ArrayList<Integer>();
		for(int g=0;g<a.size();g++){
			for(int h=g+1;h<a.size();h++){
				if(a.get(g).equals(a.get(h))){
					if(!i.contains(g)){
						i.add(g);
					}
					if(!i.contains(h)){
						i.add(h);
					}
				}
			}
		}
		for(int j:i){
			System.out.print(j);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		//设计一个map集合来存放学号和年龄
		Map<String,String> k=new HashMap<String,String>();
		k.put("1", "18");
		k.put("3", "16");
		k.put("7", "28");
		k.put("5", "18");
		k.put("2", "68");
		k.put("0", "18");
		k.put("16", "18");
		//遍历输出所有的学生
		for(Entry<String, String> tn:k.entrySet()){
//			System.out.print("学号"+tn.getKey()+" ");
//			System.out.print("年龄"+tn.getValue()+" ");
//			System.out.println();
			//输出年龄是18的学生的学号
			if(tn.getValue().equals("18")){
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(tn.getKey());
			}
		}
		// 四、定义一个arraylist集合
				List<String> m =new ArrayList<String>();
				m.add("nihao");
				m.add("wohao");
				m.add("dajiahao");
				m.add("nihao");
	   //在list的第二个位置添加元素，tahao
				m.add(1,"tahao");
	   //用Iterator迭代器打印list中元素
				Iterator<String> n=m.iterator();
				while(n.hasNext()){
					String o=n.next(); 
					if("nihao".equals(o)){
						o="nibuhao";
					}
				}
				
	}
}