package com.test;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;

public class GrandFather {
	protected int age;
	protected String name;
	protected char gender;
	void show(){
		System.out.println("我是你爸爸");
	}
	
	public GrandFather() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GrandFather(int age, String name, char gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
 