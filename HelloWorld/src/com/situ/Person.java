package com.situ;

public class Person {
	 int x=10;
	 int y=20;
	 String name="品牌";
	char gender='d';
	public static void main(String[] args) {
		Person a=new Person();
		System.out.println("最高的分是:"+a.x);
		System.out.println("dddddddd"+a.name);
		int t=a.x>a.y?a.x:a.y;
		System.out.println(t);
	}
	
	
}